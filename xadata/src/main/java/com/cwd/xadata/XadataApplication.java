package com.cwd.xadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class XadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(XadataApplication.class, args);
	}

}
