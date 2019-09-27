package com.knowledgefactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.knowledgefactory.entity.User;
import com.knowledgefactory.repository.UserRepository;

@SpringBootApplication


public class KnowledgefactorydemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(KnowledgefactorydemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("sibin", "knf", "sibinraziya@gmail.com"));

	}

	
}
