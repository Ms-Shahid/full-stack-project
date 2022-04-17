package com.conference.SpeakerConference.models;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "sessions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Session {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long session_id;
	private String session_name;
	private String session_description;
	private Integer session_length;

	//Constructor for serialisation and deserialisation
	public Session() {

	}
	
	/*In-order to connect session and spearker classes
	 * and through the database
	 * the table is already created in db
	 * just need to join with the session and speaker class
	 * here we are creating manyTomany relataionalship in bidirectional manners*/
	@ManyToMany
	@JoinTable(
		name = "session_speakers",
		joinColumns = @JoinColumn(name = "session_id"),
		inverseJoinColumns = @JoinColumn(name = "speaker_id"))
	
	private List<Speaker> speakers;
	
	public List<Speaker> getSpeakers() {
		return speakers;
	}

	public void setSpeakers(List<Speaker> speakers) {
		this.speakers = speakers;
	}

	public Long getSession_id() {
		return session_id;
	}

	public void setSession_id(Long session_id) {
		this.session_id = session_id;
	}

	public String getSession_name() {
		return session_name;
	}

	public void setSession_name(String session_name) {
		this.session_name = session_name;
	}

	public String getSession_description() {
		return session_description;
	}

	public void setSession_description(String session_description) {
		this.session_description = session_description;
	}

	public Integer getSession_length() {
		return session_length;
	}

	public void setSession_length(Integer session_length) {
		this.session_length = session_length;
	}
}
