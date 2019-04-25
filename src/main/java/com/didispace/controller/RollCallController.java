package com.didispace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.didispace.biz.RollCallBiz;
import com.didispace.entity.Course;
import com.didispace.entity.TempClassTime;
import com.didispace.entity.TimeSlot;
import com.didispace.viewEntity.VAttendanceStu;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 点名控制器 功能为：点名、查看考勤点名详情，查看课程签名情况，查看本学期考勤情况
 * 
 * @author Mity1299
 *
 */
@Controller
@RequestMapping(value = "/rollcall")
public class RollCallController {

	@Autowired
	private RollCallBiz rollCallBiz;

	/**
	 * 临时把tid固定到这里
	 */
	@ApiOperation(value = "查看课程列表", notes = "根据教师Id查看其所教授的课程列表")
	@ApiImplicitParam(name = "tId", value = "教师ID", required = true, dataType = "Integer", paramType = "path")
	@RequestMapping(value = "/courseList/{tId}", method = RequestMethod.GET)
	public String findCourseByTId(@PathVariable Integer tId, ModelMap model) {
		// 根据教师Id查看课程列表

		List<Course> courseList = rollCallBiz.findCourseByTId(tId);
		model.addAttribute("courseList", courseList);
		return "tCourseList";
	}

	@ApiOperation(value = "教师查看某个课程的课程时间列表 ", notes = "根据课程编号，看到这节课的每一节课的时间信息")
	@ApiImplicitParam(name = "cId", value = "课程编号", required = true, dataType = "Integer", paramType = "path")
	@RequestMapping(value = "/callname/{courseId}", method = RequestMethod.GET)
	public String userLogin(@PathVariable("courseId") String courseIdStr, ModelMap model) {
		Integer courseId = Integer.valueOf(courseIdStr);
		List<TempClassTime> tempClassTimeList = rollCallBiz.selectClassTimeByCId(courseId);
		Course course = rollCallBiz.selectCouseByCId(courseId);

		model.addAttribute("tempClassTimeList", tempClassTimeList);
		model.addAttribute("course", course);
		return "tCourseTimeList";
	}

	
	  @ApiOperation(value="查看课次学生考勤详情 ", notes="输入课次编号和课程编号，输出该课堂学生的考勤情况")
	  @ApiImplicitParams({
		  @ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType =
		  "String", paramType = "path"),
		  @ApiImplicitParam(name = "passwd", value = "用户密码", required = true, dataType
		  = "Integer"),
		  @ApiImplicitParam(name = "identity", value = "用户身份，1为学生，2为教师", required =
		  true, dataType = "Integer") })
	  @RequestMapping(value="/rollDeatils/{timeSlotId}/{courseId}/{count}",
	  				  method=RequestMethod.GET) public String
	  findRollDeatils(@PathVariable("timeSlotId") Integer timeSlotId,
			  		  @PathVariable("courseId") Integer courseId, 
			  		  @PathVariable("count") Integer count, 
			  		  ModelMap model) {
		  List<VAttendanceStu> vAttendanceStuList =
		  rollCallBiz.selectAtdanceStuByTimeIdByCId( timeSlotId, courseId);
		  Course course = rollCallBiz.selectCouseByCId(courseId);
		  TimeSlot timeslot = rollCallBiz.selectTimeByTimeId(timeSlotId);
		  
		  
		  model.addAttribute("count", count);
		  model.addAttribute("timeslot", timeslot);
		  model.addAttribute("course", course);
		  model.addAttribute("vAttendanceStuList", vAttendanceStuList); 
		  
		  return "tRollDetails"; 
	  }
	 
}
