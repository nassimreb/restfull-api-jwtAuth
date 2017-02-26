package com.rebouhna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;

@EnableAutoConfiguration
@SpringBootApplication
@ContextConfiguration
public class MainApp {
	public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApp.class, args);
    }

}
