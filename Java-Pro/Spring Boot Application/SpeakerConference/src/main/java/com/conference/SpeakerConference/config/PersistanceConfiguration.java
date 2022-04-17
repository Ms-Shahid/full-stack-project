package com.conference.SpeakerConference.config;

import javax.activation.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*Here all of the java configuration code is stored*/

@Configuration 
public class PersistanceConfiguration {

	@Bean
	public DataSource dataSource() {
		DataSourceBuilder<?> builder = DataSourceBuilder.create();
		builder.url("jdbc:mysql://localhost:3306/conference_demo");
		System.out.println("My custom datasource bean has been initialized and setup");
		return (DataSource) builder.build();
	}
	
}
