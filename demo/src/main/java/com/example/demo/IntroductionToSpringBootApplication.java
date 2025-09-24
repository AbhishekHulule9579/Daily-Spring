package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	@Autowired
	Apple obj;

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(dbService.getData());

//		obj.eatApple();
	}

}
