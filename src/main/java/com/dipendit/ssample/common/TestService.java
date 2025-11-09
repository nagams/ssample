package com.dipendit.ssample.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestService {

    private final AlertConfig alertConfig;

    public TestService(AlertConfig alertConfig) {
        this.alertConfig = alertConfig;
    }

    public Map<String, Map<String, Integer>> getQueueNames() {
        return alertConfig.getQueueNames();
    }

    @Value("${alert.pctFailed.myQueueName}")
    private String myQueueName;

    public String getMyQueueName() {
        return myQueueName;
    }
}
