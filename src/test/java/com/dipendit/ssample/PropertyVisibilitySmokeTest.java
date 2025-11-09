package com.dipendit.ssample;

import com.dipendit.ssample.common.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
public class PropertyVisibilitySmokeTest {

    @Autowired
    Environment env;

    @Autowired
    TestService testService;

    @Test
    void printKey() {
        System.out.println("=====> TEST <=====");
        System.out.println(testService.getMyQueueName());
        System.out.println(testService.getQueueNames());
        System.out.println("=====> TEST <=====");
    }
}
