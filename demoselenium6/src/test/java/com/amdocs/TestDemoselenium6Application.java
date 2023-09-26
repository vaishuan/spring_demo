package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoselenium6Application {

	public static void main(String[] args) {
		SpringApplication.from(Demoselenium6Application::main).with(TestDemoselenium6Application.class).run(args);
	}

}
