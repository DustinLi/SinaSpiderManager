package com.qiqiao.ssm.dao.mapper;

import com.qiqiao.ssm.dao.model.SysLogs;

public interface SysLogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs
     *
     * @mbggenerated Mon Jan 23 11:30:55 CST 2017
     */
    int deleteByPrimaryKey(Integer lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs
     *
     * @mbggenerated Mon Jan 23 11:30:55 CST 2017
     */
    int insert(SysLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs
     *
     * @mbggenerated Mon Jan 23 11:30:55 CST 2017
     */
    int insertSelective(SysLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs
     *
     * @mbggenerated Mon Jan 23 11:30:55 CST 2017
     */
    SysLogs selectByPrimaryKey(Integer lid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs
     *
     * @mbggenerated Mon Jan 23 11:30:55 CST 2017
     */
    int updateByPrimaryKeySelective(SysLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_logs
     *
     * @mbggenerated Mon Jan 23 11:30:55 CST 2017
     */
    int updateByPrimaryKey(SysLogs record);
}