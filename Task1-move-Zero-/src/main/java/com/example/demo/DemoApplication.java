package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.demo.controller.exchange;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		int[] a = new int[] {0, 3, 4, 0, 1, 2, 5, 0};
		exchange(a);
//		SpringApplication.run(DemoApplication.class, args);
	}

}