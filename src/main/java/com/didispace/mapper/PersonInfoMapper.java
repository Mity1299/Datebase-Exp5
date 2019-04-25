package com.didispace.mapper;

import com.didispace.entity.PersonInfo;

public interface PersonInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_info
     *
     * @mbg.generated Thu Apr 25 16:10:04 CST 2019
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_info
     *
     * @mbg.generated Thu Apr 25 16:10:04 CST 2019
     */
    int insert(PersonInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_info
     *
     * @mbg.generated Thu Apr 25 16:10:04 CST 2019
     */
    int insertSelective(PersonInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_info
     *
     * @mbg.generated Thu Apr 25 16:10:04 CST 2019
     */
    PersonInfo selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_info
     *
     * @mbg.generated Thu Apr 25 16:10:04 CST 2019
     */
    int updateByPrimaryKeySelective(PersonInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_info
     *
     * @mbg.generated Thu Apr 25 16:10:04 CST 2019
     */
    int updateByPrimaryKey(PersonInfo record);
}