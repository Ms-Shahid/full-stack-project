package com.conference.SpeakerConference.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.conference.SpeakerConference.models.Session;
import com.conference.SpeakerConference.repositories.SessionRepository;

/*
 * @RestContoller -> this will respond to payloads incoming and outgoing as JSON REST endpoints
 * @RequestMapping -> tells the router what the mapping URL will look like, in mycase i.e "api/v1/session"*/

@RestController
@RequestMapping("api/v1/session")

public class SessionController {

	/*
	 * Spring will autowire interfaces with controller when controller is built,
	here we create a sessionRespository instance*/
	@Autowired
	private SessionRepository sessionRepository;
	
	@GetMapping
	public List<Session> list(){
		return sessionRepository.findAll();
	}
	
	//all CRUD operation -> CREATE, READ, UPDATE and DELETE
	
	/*READ*/
	@GetMapping
	@RequestMapping("{id}")
	public Session get(@PathVariable Long id) {
		return sessionRepository.getById(id);
	}
	
	/*CREATE*/
	@PostMapping
	public Session create(@RequestBody final Session session) {
		return sessionRepository.saveAndFlush(session);
	}
	
	/*DELETE */
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		sessionRepository.deleteById(id);
	}
	
	/*UPDATE */
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public Session update (@PathVariable Long id, @RequestBody Session session) {
		//put HTTP request will update all of the record, where as the PATCH will update partial update
		Session existingSession = sessionRepository.getById(id);
		BeanUtils.copyProperties(session, existingSession, "session_id");
		return sessionRepository.saveAndFlush(existingSession);
	}
	
}
