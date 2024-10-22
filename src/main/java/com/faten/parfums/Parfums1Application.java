package com.faten.parfums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.faten.parfums.entities.Parfum;

@SpringBootApplication
public class Parfums1Application implements CommandLineRunner{
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(Parfums1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Parfum.class);
	}

	
}
