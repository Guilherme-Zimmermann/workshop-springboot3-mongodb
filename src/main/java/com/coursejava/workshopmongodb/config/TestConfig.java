package com.coursejava.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.coursejava.workshopmongodb.domain.Post;
import com.coursejava.workshopmongodb.domain.User;
import com.coursejava.workshopmongodb.repositories.PostRepository;
import com.coursejava.workshopmongodb.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
			
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User u1 = new User(null, "Gui", "gui@gmail.com");
		User u2 = new User(null, "Will", "will@gmail.com");
		User u3 = new User(null, "Zimmermann", "zimmermann@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("01/08/2023"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", u1);
		Post post2 = new Post(null, sdf.parse("26/07/2023"), "Bom dia", "Acordei feliz hoje", u2);
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		postRepository.saveAll(Arrays.asList(post1, post2));
	}
	
}
