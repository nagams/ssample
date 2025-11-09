package com.dipendit.ssample.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@ConfigurationProperties(prefix = "alerts")
@Component
public class AlertConfig {
    private Map<String, Map<String, Integer>> queueNames;

    public Map<String, Map<String, Integer>> getQueueNames() {
        return queueNames;
    }

    public void setQueueNames(Map<String, Map<String, Integer>> queueNames) {
        this.queueNames = queueNames;
    }

}
