package com.didispace.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.didispace.biz.RollCallBiz;
import com.didispace.entity.Course;
import com.didispace.entity.Section;
import com.didispace.entity.Student;
import com.didispace.entity.Teacher;
import com.didispace.entity.TempClassTime;
import com.didispace.entity.TimeSlot;
import com.didispace.mapper.CourseMapper;
import com.didispace.mapper.PersonInfoMapper;
import com.didispace.mapper.RecordMapper;
import com.didispace.mapper.SectionMapper;
import com.didispace.mapper.StudentMapper;
import com.didispace.mapper.TeacherMapper;
import com.didispace.mapper.TimeSlotMapper;
import com.didispace.viewEntity.VAttendanceStu;
import com.didispace.viewEntity.VStuAndClass;
@Service(value="rollCallBiz")
public class RollCallBizImpl implements RollCallBiz{

	@Autowired
	CourseMapper courseMapper;//自动装载要用的mapper
	@Autowired
	PersonInfoMapper personInfoMapper;
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	TeacherMapper teacherMapper;
	@Autowired
	SectionMapper sectionMapper;
	@Autowired
	TimeSlotMapper timeSlotMapper;
	@Autowired
	RecordMapper recordMapper;
	
	
	@Override
	public List<Course> findCourseByTId(Integer tId) {
		// TODO Auto-generated method stub
		return courseMapper.selectByTid(tId);
	}

	@Override
	public Course selectCouseByCId(Integer courseId) {
		// TODO Auto-generated method stub
		return courseMapper.selectByPrimaryKey(courseId);
		
	}
	@Override
	public String loginUserIsOk(String username, String passwd, Integer type) {
		// TODO Auto-generated method stub
		String realPasswd=null;
		if(type==1) {
			//学生
			Student stu = studentMapper.selectBySname(username);
			realPasswd= stu.getsPasswd();
		}else if(type==2){
			//教师
			Teacher tea =teacherMapper.selectByTName(username);
			realPasswd= tea.gettPasswd();
		}else {
			return "身份选择错误！";
		}
		if(realPasswd!=null) {
			if(realPasswd.equals(passwd)==true) {
				return null;//成功登录
			}else return "密码错误！";
		}else return "密码为空！";
		
	}


	@Override
	public Student selectStuBySName(String sname) {
		// TODO Auto-generated method stub
		return studentMapper.selectBySname(sname);
	}


	@Override
	public Teacher selectStuByTName(String tname) {
		// TODO Auto-generated method stub
		return teacherMapper.selectByTName(tname);
	}


	/**
	 * 	根据课程编号获得course：获得课程名称
		根据课程编号获得section:获得第几次课，是否点过名
		根据secion.time_slot_id和获得time:获得第几周，周几，开始时间
	 */
	@Override
	public List<TempClassTime> selectClassTimeByCId(Integer cId) {
		// TODO Auto-generated method stub
		ArrayList<TempClassTime> tClassTimeList = new ArrayList<TempClassTime>();
		
		Course course = courseMapper.selectByPrimaryKey(cId);
		List<Section> secList =sectionMapper.selectyByCId(cId);
		if(secList==null) return null;
		
		TimeSlot timeSlot=null;
		//注意list里放的是一个对象的指针！，因此不可以在这一行new TempClassTime()
		//否则加入的都是同一个对象
		ArrayList<TimeSlot> timeList = new ArrayList<TimeSlot>();
		for(Section sec: secList) {
			TempClassTime tClassTime=new TempClassTime();
			timeSlot = timeSlotMapper.selectByPrimaryKey(sec.getTimeSlotId());
			tClassTime.setTimeSlotId(timeSlot.getTimeSlotId());
			tClassTime.setCount(sec.getSecofcourse());//这里有错，
			tClassTime.setDay(timeSlot.getDay());
			tClassTime.setStartTime(timeSlot.getStartTime());
			tClassTime.setStatus(sec.getStatus());
			tClassTime.setWeek(timeSlot.getWeek());
			tClassTimeList.add(tClassTime);
		}
		return tClassTimeList;

	}

	
  @Override public List<VAttendanceStu> selectAtdanceStuByTimeIdByCId(
		  Integer timeSlotId, Integer courseId) { 
	  // TODO Auto-generated method stub return
	  return recordMapper.selectAtdanceStuByTimeIdByCId(timeSlotId, courseId); 
  }

	@Override
	public TimeSlot selectTimeByTimeId(Integer timeId) {
		// TODO Auto-generated method stub
		return timeSlotMapper.selectByPrimaryKey(timeId);
	}

	@Override
	public List<VStuAndClass> selectStuByCourseId(Integer courseId) {
		// TODO Auto-generated method stub
		return studentMapper.selectByCId(courseId);
	}
 
	
	
	


	

}
