package com.didispace.viewEntity;

import com.didispace.entity.Class;

public class VAttendanceStu {
	private Integer stuId;
	private String stuName;
	private String attendance;
	private Class classTemp;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public Class getClassTemp() {
		return classTemp;
	}
	public void setClassTemp(Class classTemp) {
		this.classTemp = classTemp;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	
	
	
}
