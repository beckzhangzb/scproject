package com.beckzzb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer 启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class ScprojectApplication {

	/**
	 * 启动方法
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ScprojectApplication.class, args);
	}

}

