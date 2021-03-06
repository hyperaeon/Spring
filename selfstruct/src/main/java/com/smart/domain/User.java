package com.smart.domain;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_name
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.last_visit
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    private Date lastVisit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.last_ip
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    private String lastIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param userId the value for t_user.user_id
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_name
     *
     * @return the value of t_user.user_name
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_name
     *
     * @param userName the value for t_user.user_name
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.last_visit
     *
     * @return the value of t_user.last_visit
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public Date getLastVisit() {
        return lastVisit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.last_visit
     *
     * @param lastVisit the value for t_user.last_visit
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.last_ip
     *
     * @return the value of t_user.last_ip
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.last_ip
     *
     * @param lastIp the value for t_user.last_ip
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }
}