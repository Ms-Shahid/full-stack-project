package com.plurasight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.plurasight.service.SpeakerService;
import com.plurasight.service.SpeakerServiceImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		// SpeakerService service = new SpeakerServiceImpl();
		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		System.out.println(service.findAll().get(0).getFirstName());
		System.err.println(service.findAll().get(0).getLastName());
	}
}
