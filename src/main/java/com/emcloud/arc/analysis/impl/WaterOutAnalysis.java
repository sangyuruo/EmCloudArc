package com.emcloud.arc.analysis.impl;


import com.emcloud.arc.analysis.analysis.DefaultAnalysisResult;
import com.emcloud.arc.analysis.analysis.DefaultOneParamAnalysis;

import java.util.Map;

public class WaterOutAnalysis extends DefaultOneParamAnalysis {
    @Override
    public DefaultAnalysisResult handle(Float waterlev) {
        DefaultAnalysisResult defaultAnalysis = new DefaultAnalysisResult();

        int alarmLevel = 0;
        boolean alarm = true;
        if (waterlev > 0 && waterlev < 5) {
            alarmLevel = 1;
        } else if (waterlev >= 5 && waterlev < 10) {
            alarmLevel = 2;
        } else if (waterlev >= 10) {
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
