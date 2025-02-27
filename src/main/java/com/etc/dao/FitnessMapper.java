package com.etc.dao;

import com.etc.entity.Fitness;
import com.etc.entity.FitnessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FitnessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    long countByExample(FitnessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int deleteByExample(FitnessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int insert(Fitness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int insertSelective(Fitness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    List<Fitness> selectByExample(FitnessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    Fitness selectByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Fitness record, @Param("example") FitnessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Fitness record, @Param("example") FitnessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Fitness record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fitness
     *
     * @mbg.generated Wed Nov 11 14:47:35 GMT+08:00 2020
     */
    int updateByPrimaryKey(Fitness record);
}