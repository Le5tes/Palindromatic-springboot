package com.palindromatic.palidromaticservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PalidromaticServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalidromaticServiceApplication.class, args);
	}

	public boolean check(String palindrome) {
		return (palindrome.equals(new StringBuilder(palindrome).reverse().toString()));
	};
}
