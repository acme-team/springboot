package com.yc.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication(scanBasePackages={"com.*.Controller,com.*.service,com.*.schedul"})
@EntityScan(basePackages={"com.*.entity"})
@EnableJpaRepositories(basePackages="com.*.repository")
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		//运行服务器
		//第二次提交
		SpringApplication.run(Application.class,args);
	}
}
