package com.etc.dao;

import com.etc.entity.Bodydata;
import com.etc.entity.BodydataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BodydataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    long countByExample(BodydataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int deleteByExample(BodydataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int insert(Bodydata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int insertSelective(Bodydata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    List<Bodydata> selectByExample(BodydataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    Bodydata selectByPrimaryKey(Integer bid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Bodydata record, @Param("example") BodydataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Bodydata record, @Param("example") BodydataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Bodydata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bodydata
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByPrimaryKey(Bodydata record);
}