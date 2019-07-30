package com.training.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.ibm.services.ConsultRepository;

@SpringBootApplication
public class IbmApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbmApplication.class, args);
		new ConsultRepository().loadUsers();
	}

}
