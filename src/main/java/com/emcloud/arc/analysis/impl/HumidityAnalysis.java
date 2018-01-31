package com.emcloud.arc.analysis.impl;

import com.emcloud.arc.analysis.analysis.DefaultAnalysisResult;
import com.emcloud.arc.analysis.analysis.DefaultOneParamAnalysis;

import java.util.Map;

public class HumidityAnalysis extends DefaultOneParamAnalysis {
    @Override
    public DefaultAnalysisResult handle(Float hum) {
        DefaultAnalysisResult defaultAnalysis = new DefaultAnalysisResult();
        int alarmLevel = 0;
        boolean alarm = true;
        if (hum > 30 && hum < 45) {
            alarmLevel = 1;
        } else if (hum >= 50 && hum < 60) {
            alarmLevel = 2;
        } else if (hum >= 60) {
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