package com.didispace.mapper;

import com.didispace.entity.User2;

public interface User2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Sat Apr 20 11:35:46 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Sat Apr 20 11:35:46 CST 2019
     */
    int insert(User2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Sat Apr 20 11:35:46 CST 2019
     */
    int insertSelective(User2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Sat Apr 20 11:35:46 CST 2019
     */
    User2 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Sat Apr 20 11:35:46 CST 2019
     */
    int updateByPrimaryKeySelective(User2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user2
     *
     * @mbg.generated Sat Apr 20 11:35:46 CST 2019
     */
    int updateByPrimaryKey(User2 record);

}