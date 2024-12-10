package com.example.RecordsTable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.RecordsTable"})
public class RecordsTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordsTableApplication.class, args);
	}

}
