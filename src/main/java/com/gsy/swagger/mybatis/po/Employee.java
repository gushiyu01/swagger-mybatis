package com.gsy.swagger.mybatis.po;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.id
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.last_name
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.gender
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    private Byte gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.email
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.d_id
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    private String dId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.id
     *
     * @return the value of employee.id
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.id
     *
     * @param id the value for employee.id
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.last_name
     *
     * @return the value of employee.last_name
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.last_name
     *
     * @param lastName the value for employee.last_name
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.gender
     *
     * @return the value of employee.gender
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.gender
     *
     * @param gender the value for employee.gender
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.email
     *
     * @return the value of employee.email
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.email
     *
     * @param email the value for employee.email
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.d_id
     *
     * @return the value of employee.d_id
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public String getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.d_id
     *
     * @param dId the value for employee.d_id
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }
}