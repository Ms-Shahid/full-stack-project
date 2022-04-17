package com.conference.SpeakerConference.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	/*The @value -> tells the springBoot to check the version of app in application.properties file under resource*/
	@Value("${app.version}")
	private String appVersion;
	
	//default handler
	@GetMapping
	@RequestMapping("/")
	public Map getStatus() {
		Map map = new HashMap<String, String>();
		map.put("app-version", appVersion);
		return map;
	}
}
