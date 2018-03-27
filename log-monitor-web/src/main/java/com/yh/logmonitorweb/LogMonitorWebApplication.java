package com.yh.logmonitorweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LogMonitorWebApplication {
	protected static Logger logger= LoggerFactory.getLogger(LogMonitorWebApplication.class);

	@GetMapping
	public String test() {
		logger.error("aaaaaa");
		return "aaaa";
	}

	public static void main(String[] args) {
		SpringApplication.run(LogMonitorWebApplication.class, args);
	}
}
