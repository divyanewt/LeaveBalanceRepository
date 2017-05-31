package com.newt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@EnableAutoConfiguration
@EnableSwagger2

@EnableJpaRepositories("com.newt.leavebalance.repository")
@EntityScan("com.newt.leavebalance.model")
@ComponentScan(basePackages={"com"})
@SpringBootApplication
public class LeaveBalanceMain {

	public static void main(String[] args) {
		SpringApplication.run(LeaveBalanceMain.class, args);
	}
}
