package com.coursejava.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.coursejava.workshopmongodb.domain.User;
import com.coursejava.workshopmongodb.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
			
		userRepository.deleteAll();
		
		User u1 = new User(null, "Gui", "gui@gmail.com", "1234");
		User u2 = new User(null, "Will", "will@gmail.com", "12345");
		User u3 = new User(null, "Zimmermann", "zimmermann@gmail.com", "12346");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}
	
}
