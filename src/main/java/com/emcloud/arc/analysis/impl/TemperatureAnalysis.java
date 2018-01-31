package com.emcloud.arc.analysis.impl;

import com.emcloud.arc.analysis.analysis.DefaultAnalysisResult;
import com.emcloud.arc.analysis.analysis.DefaultOneParamAnalysis;


public class TemperatureAnalysis extends DefaultOneParamAnalysis {

    @Override
    public DefaultAnalysisResult handle(String temperatureStr) {
        DefaultAnalysisResult defaultAnalysis = new DefaultAnalysisResult();
        int temperature = Integer.parseInt(temperatureStr);
        int alarmLevel = 0;
        boolean alarm = true;
        if (temperature > 30 && temperature < 40) {
            alarmLevel = 1;
        } else if (temperature >40  && temperature < 50) {
            alarmLevel = 2;
        } else if (temperature > 50) {
            alarmLevel = 3;
        }else{
            alarm = false;
        }
        defaultAnalysis.setAlarm( alarm );
        defaultAnalysis.setAlarmLevel(alarmLevel);
        return defaultAnalysis;
    }
}
