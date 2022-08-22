package com.br.lucas.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) {
		System.out.println("Olá mundo!");
		SpringApplication.run(LogicaApplication.class, args);
	}

}
