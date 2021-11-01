package com.douzone.springbootex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 
 * Bootstrap Class
 *
 */
@SpringBootApplication  	// <!-- Spring boot basic dependency --> 이걸 설정해서 된다
public class HelloWorldApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class,args);
	}
}
