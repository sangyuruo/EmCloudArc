package com.emcloud.arc.analysis.impl;

import com.emcloud.arc.analysis.analysis.DefaultAnalysisResult;
import com.emcloud.arc.analysis.analysis.DefaultOneParamAnalysis;

public class WaterLevelAnalysis extends DefaultOneParamAnalysis {
    @Override
    public DefaultAnalysisResult handle(String waterlevStr) {
        DefaultAnalysisResult defaultAnalysis = new DefaultAnalysisResult();
        int waterlev = Integer.parseInt(waterlevStr);
        int alarmLevel = 0;
        boolean alarm = true;
        if (waterlev > 5 && waterlev < 10) {
            alarmLevel = 1;
        } else if (waterlev >= 10 && waterlev < 20) {
            alarmLevel = 2;
        } else if (waterlev >= 20) {
            alarmLevel = 3;
        }else{
            alarm = false;
        }
        defaultAnalysis.setAlarm( alarm );
        defaultAnalysis.setAlarmLevel(alarmLevel);
        return defaultAnalysis;
    }
}
