package br.com.trevezani.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.trevezani.controller")
public class SpringbootDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}

}
