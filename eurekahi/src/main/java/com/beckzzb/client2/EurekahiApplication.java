package com.beckzzb.client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * application 在根目录下，子目录的controller才会生效起作用
 * eureka 客户端注册服务
 * @author zzb
 * @since 2019-1-14 17:29:40
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekahiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekahiApplication.class, args);
	}

	/**
	 * 端口号
	 */
	@Value("${server.port}")
	private String port;

	/**
	 * info测试接口
	 * @param name
	 * @return
	 */
	@RequestMapping(value = {"/hi"}, method = {RequestMethod.POST, RequestMethod.GET})
	public String home(@RequestParam String name) {
		return "hi: " + name + ", i am from port:" + port;
	}
}

