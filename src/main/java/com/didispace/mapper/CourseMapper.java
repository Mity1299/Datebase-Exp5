package com.didispace.mapper;

import java.util.List;

import com.didispace.entity.Course;

public interface CourseMapper {

    int deleteByPrimaryKey(Integer courseId);


    int insert(Course record);


    int insertSelective(Course record);


    Course selectByPrimaryKey(Integer courseId);

    /**
     * selectByTid
     * 根据教师编号查找课程列表
     */
    List<Course> selectByTid(Integer tId);
    
    int updateByPrimaryKeySelective(Course record);


    int updateByPrimaryKey(Course record);
}