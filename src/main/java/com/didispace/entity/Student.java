package com.didispace.entity;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.s_id
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    private Integer sId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.s_name
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    private String sName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.s_passwd
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    private String sPasswd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.class_id
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    private Integer classId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.s_id
     *
     * @return the value of student.s_id
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.s_id
     *
     * @param sId the value for student.s_id
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.s_name
     *
     * @return the value of student.s_name
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    public String getsName() {
        return sName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.s_name
     *
     * @param sName the value for student.s_name
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.s_passwd
     *
     * @return the value of student.s_passwd
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    public String getsPasswd() {
        return sPasswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.s_passwd
     *
     * @param sPasswd the value for student.s_passwd
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    public void setsPasswd(String sPasswd) {
        this.sPasswd = sPasswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.class_id
     *
     * @return the value of student.class_id
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.class_id
     *
     * @param classId the value for student.class_id
     *
     * @mbg.generated Thu Apr 25 15:08:32 CST 2019
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}