package com.didispace.mapper;

import java.util.List;

import com.didispace.entity.Section;
import com.didispace.entity.SectionKey;

public interface SectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbg.generated Thu Apr 25 16:04:33 CST 2019
     */
    int deleteByPrimaryKey(SectionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbg.generated Thu Apr 25 16:04:33 CST 2019
     */
    int insert(Section record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbg.generated Thu Apr 25 16:04:33 CST 2019
     */
    int insertSelective(Section record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbg.generated Thu Apr 25 16:04:33 CST 2019
     */
    Section selectByPrimaryKey(SectionKey key);
    /**
     * 根据课程编号获得课程时间列表
     * @param record
     * @return
     */
    List<Section> selectyByCId(Integer cId);
    

    int updateByPrimaryKeySelective(Section record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbg.generated Thu Apr 25 16:04:33 CST 2019
     */
    int updateByPrimaryKey(Section record);
}