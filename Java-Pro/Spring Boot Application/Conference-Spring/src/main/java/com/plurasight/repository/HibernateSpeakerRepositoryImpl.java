package com.plurasight.repository;

import java.util.ArrayList;
import java.util.List;

import com.plurasight.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

	@Override
	public List<Speaker> findAll(){
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		speaker.setFirstName("Shahid");
		speaker.setLastName("MS");
		
		speakers.add(speaker);
		return speakers;
	}
	
}
