package com.beckzzb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;

/**
 * 链路追踪
 */
@RestController
@SpringBootApplication
public class ZipkinServicemiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServicemiyaApplication.class, args);
	}

	private static final Logger LOG = LoggerFactory.getLogger(ZipkinServicemiyaApplication.class.getName());


	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@RequestMapping("/hi")
	public String home(){
		LOG.info("hi is being called");
		return "hi i'm miya!";
	}

	@RequestMapping("/miya")
	public String info(){
		LOG.info("info is being called");
		return restTemplate.getForObject("http://localhost:8988/info",String.class);
	}

	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}
}

