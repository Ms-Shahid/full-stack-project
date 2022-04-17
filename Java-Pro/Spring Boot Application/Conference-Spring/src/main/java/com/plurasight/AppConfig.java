package com.plurasight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.plurasight.repository.HibernateSpeakerRepositoryImpl;
import com.plurasight.repository.SpeakerRepository;
import com.plurasight.service.SpeakerService;
import com.plurasight.service.SpeakerServiceImpl;

/*
 * All of the project/application configuration starts from here
 * To start the configuration the annotation -> @Configuration (the applicationContext.xml replaced
 * by @Configuration annotation)*/

@Configuration
public class AppConfig {

	@Bean(name="speakerService")
	public SpeakerService getSpeakerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		service.setRepository(getSpeakerRepository());
		return service;
	}
	
	/* Setter Injection -> injecting getSpeakerRepository into setter setRepository of 
	 * SpeakerServiceImpl class which implements SpeakerService.
	 * @Bean -> is a singleton class
	 */
	@Bean(name = "speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
	
}
