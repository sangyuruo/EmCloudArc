package com.emcloud.arc.analysis.impl;

import com.emcloud.arc.analysis.analysis.DefaultAnalysisResult;
import com.emcloud.arc.analysis.analysis.DefaultOneParamAnalysis;

import java.util.Map;

public class Pm25Analysis extends DefaultOneParamAnalysis {

    @Override
    public DefaultAnalysisResult handle(Float pm25) {
        DefaultAnalysisResult defaultAnalysis = new DefaultAnalysisResult();
        int alarmLevel = 0;
        boolean alarm = true;
        if (pm25 > 10 && pm25 < 20) {
            alarmLevel = 1;
        } else if (pm25 >= 20 && pm25 < 30) {
            alarmLevel = 2;
        } else if (pm25 >= 30) {
            alarmLevel = 3;
        }else{
            alarm = false;
        }
        defaultAnalysis.setAlarm( alarm );
        defaultAnalysis.setAlarmLevel(alarmLevel);
        return defaultAnalysis;
    }

    @Override
    public DefaultAnalysisResult handle(Map<String, Float> data) {
        return handle(data.get(""));

    }
}
