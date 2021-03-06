package com.smart.dao;

import com.smart.domain.LoginLog;
import com.smart.domain.LoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int countByExample(LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int deleteByExample(LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int deleteByPrimaryKey(Integer loginLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int insert(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int insertSelective(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    List<LoginLog> selectByExample(LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    LoginLog selectByPrimaryKey(Integer loginLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int updateByExampleSelective(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int updateByExample(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int updateByPrimaryKeySelective(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int updateByPrimaryKey(LoginLog record);
}