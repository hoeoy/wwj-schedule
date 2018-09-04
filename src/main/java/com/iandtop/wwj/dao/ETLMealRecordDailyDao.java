package com.iandtop.wwj.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author andyzhao
 */
@Mapper
public interface ETLMealRecordDailyDao {
    void etlDaily();
}
