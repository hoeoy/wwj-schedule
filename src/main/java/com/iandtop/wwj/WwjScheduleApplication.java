package com.iandtop.wwj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WwjScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WwjScheduleApplication.class, args);
	}
}
