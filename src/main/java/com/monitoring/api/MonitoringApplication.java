package com.monitoring.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 
 * @author MP-29
 * This is the main entry point of our Spring Boot application. 
 * We don't need to care about the configuration and we don't need any xml file, 
 * we can just focus on our functionality. 
 *
 */
@SpringBootApplication
@EnableJpaAuditing
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoringApplication.class, args);
	}
}
