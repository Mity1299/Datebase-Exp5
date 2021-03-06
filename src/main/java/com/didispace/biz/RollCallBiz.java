package com.didispace.biz;



import java.util.List;

import com.didispace.entity.Course;
import com.didispace.entity.Student;
import com.didispace.entity.Teacher;
import com.didispace.entity.TempClassTime;
import com.didispace.entity.TimeSlot;
import com.didispace.viewEntity.VAttendanceStu;
import com.didispace.viewEntity.VStuAndClass;

public interface RollCallBiz {
	
	
	public List<Course> findCourseByTId(Integer tId);

	/**
	 * 查看用户是否能合法登录
	 * @param userId
	 * @param passwd
	 * @param identity
	 * @return
	 */
	public String loginUserIsOk(String username,String passwd,Integer type);
	
	public Student selectStuBySName(String sname);
	
	public Teacher selectStuByTName(String tname);
	
	/**
	 * 根据课程编号返回课程时间列表
	 */
	public List<TempClassTime> selectClassTimeByCId(Integer cId);
	
	public Course selectCouseByCId(Integer courseId);

	public List<VAttendanceStu> selectAtdanceStuByTimeIdByCId(Integer timeSlotId,Integer courseId);

	public TimeSlot selectTimeByTimeId(Integer timeId);
	/**
	 * 根据课程编号查找这节课的学生名单
	 */
	public List<VStuAndClass> selectStuByCourseId(Integer courseId);
}
