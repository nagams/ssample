package com.dipendit.ssample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;

@SpringBootApplication
public class SsampleApplication {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    private static final TaskExecutor exec = new SimpleAsyncTaskExecutor();

	public static void main(String[] args) {
		SpringApplication.run(SsampleApplication.class, args);

        //exec.execute(() -> System.out.println("Hit Enter to terminate..."));
	}

}
