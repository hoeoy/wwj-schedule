package com.iandtop.wwj.service;

import com.iandtop.wwj.dao.ETLMealRecordDailyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by iandtop on 2018/9/4.
 */
@Service
public class ETLMealRecordDailySchedule {
    @Autowired
    private ETLMealRecordDailyDao etlMealRecordDailyDao;

//    @Scheduled(cron= "0 38 19 * * ?")
    @Scheduled(cron= "${cron}")
    public void etlDaily() {
        etlMealRecordDailyDao.etlDaily();
    }
}
