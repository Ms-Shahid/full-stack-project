package com.conference.SpeakerConference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conference.SpeakerConference.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long>{
	

}
