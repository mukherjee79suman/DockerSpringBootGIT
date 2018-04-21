package com.self.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan("com.self.test")
public class DockerSpringBootGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootGitApplication.class, args);
	}
}
