package com.coderscampus.week13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.coderscampus.app1.week13.domain.User;
import com.coderscampus.app1.week13.service.FileService;

@Configuration
@Profile("dev")
public class Week13DevConfiguration {

	//For illustration purposes only as an example of a real
	//world type of scenario of connecting to a database
//	@Bean
//	public Datasource datasource() {
//		Datasource db = new Datasource();
//		db.setConnectionString("http://aslkfj.sdfjhsd.com:3360");
//		db.setUsername("dev01bdblahblah");
//		
//		return db;
//	}
	
	@Bean
	public FileService fileService () {
		return new FileService("test.txt");
	}
	
	@Bean
	public User superUser() {
		return new User("trevor@craftycodr.com", "asdfasdf", "Trevor Page");
	}
	
	@Bean
	public User regularUser() {
		return new User("regular_joe@gmail.com", "joe123", "Joe Blow");
	}
	
}
