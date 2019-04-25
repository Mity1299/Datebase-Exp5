package com.didispace.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.didispace.entity.User;

import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/index")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "test/index";  
    }

    
    @RequestMapping(value="/index2", method=RequestMethod.GET)
    public String inputData(){
    	
        return "forward:/hello/testa"; //Spring框架找到对应的View并渲染
    }
    
    @RequestMapping(value="/testa", method=RequestMethod.GET)
    public String inputData2(){
    	
        return "test/testa"; //Spring框架找到对应的View并渲染
    }


    @RequestMapping(value="/testb", method=RequestMethod.GET)
    public String outputDataX(HttpServletRequest request){
        return "redirect:/hello/testa";
    }


}