package com.etc.dao;

import com.etc.entity.Bloodpress;
import com.etc.entity.BloodpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodpressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    long countByExample(BloodpressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int deleteByExample(BloodpressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer bpid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int insert(Bloodpress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int insertSelective(Bloodpress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    List<Bloodpress> selectByExample(BloodpressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    Bloodpress selectByPrimaryKey(Integer bpid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Bloodpress record, @Param("example") BloodpressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Bloodpress record, @Param("example") BloodpressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Bloodpress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bloodpress
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByPrimaryKey(Bloodpress record);
}