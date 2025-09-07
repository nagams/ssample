package com.dipendit.ssample;

import org.springframework.boot.SpringApplication;

public class TestSsampleApplication {

	public static void main(String[] args) {
		SpringApplication.from(SsampleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
