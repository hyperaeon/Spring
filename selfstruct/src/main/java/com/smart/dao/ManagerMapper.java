package com.smart.dao;

import com.smart.domain.Manager;
import com.smart.domain.ManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int countByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int deleteByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int deleteByPrimaryKey(Integer manaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int insert(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int insertSelective(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    List<Manager> selectByExample(ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    Manager selectByPrimaryKey(Integer manaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int updateByPrimaryKeySelective(Manager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_manager
     *
     * @mbggenerated Sun Jul 20 13:41:04 CST 2014
     */
    int updateByPrimaryKey(Manager record);
}