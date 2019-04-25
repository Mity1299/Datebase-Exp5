package com.didispace.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.didispace.biz.RollCallBiz;
import com.didispace.entity.Student;
import com.didispace.entity.Teacher;
import com.didispace.entity.User;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/user")
public class UserRocallController {
	
	@Autowired
	RollCallBiz rollCallBiz;
	
	@ApiOperation(value="返回登录界面 ")
	@RequestMapping("/login2")
	public String login2Page() {
		return "login2";
	}
	/*
	 * @ApiOperation(value="返回登录界面 ")
	 * 
	 * @RequestMapping("/login") public String loginPage() { return "login"; }
	 */
	
	@ApiOperation(value="用户登录 ", notes="用户在表单输入用户名，密码，身份进行身份验证")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "passwd", value = "用户密码", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "identity", value = "用户身份，1为学生，2为教师", required = true, dataType = "Integer")
    })
    @RequestMapping(value="/login.do", method=RequestMethod.POST)
    public String userLogin(@RequestParam("name") String name,
				    		@RequestParam("passwd") String passwd,
				    		@RequestParam("identity") Integer identity,
				    		ModelMap model,
				    		HttpServletRequest request
				    		) {
		String msg=rollCallBiz.loginUserIsOk(name, passwd, identity);
		if(msg==null) {
			//登录成功
			HttpSession session =request.getSession();
			//查找该用户
			if(identity==1) {
				Student stu= rollCallBiz.selectStuBySName(name);
				session.setAttribute("loginStu", stu);
				return "stuIndex";
			}else {
				Teacher tea = rollCallBiz.selectStuByTName(name);
				session.setAttribute("loginTea", tea);
				return "teaIndex";
			}
		}else{
			model.put("msg", msg);
			return "login2";
		}
        
    }
	
	
	
	
}
