package com.conference.SpeakerConference.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conference.SpeakerConference.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}
