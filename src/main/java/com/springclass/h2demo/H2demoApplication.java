package com.springclass.h2demo;

import com.springclass.h2demo.domain.Post;
import com.springclass.h2demo.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class H2demoApplication {

	private static final Logger logger = LoggerFactory.getLogger(H2demoApplication.class);

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}

	@PostConstruct
	void seePosts(){
		logger.info("seePosts method called...");
		for(Post post : postRepository.findAll()){
			logger.info(post.toString());
		}
	}

}
