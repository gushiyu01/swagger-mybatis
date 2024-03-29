package com.gsy.swagger.mybatis.mapper;

import com.gsy.swagger.mybatis.po.Score;
import com.gsy.swagger.mybatis.po.ScoreExample;
import com.gsy.swagger.mybatis.po.ScoreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    int countByExample(ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    int deleteByExample(ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    int deleteByPrimaryKey(ScoreKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    int insert(Score record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    int insertSelective(Score record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    List<Score> selectByExample(ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    Score selectByPrimaryKey(ScoreKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    int updateByPrimaryKeySelective(Score record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Oct 20 11:29:28 CST 2019
     */
    int updateByPrimaryKey(Score record);
}