package com.example.springbootSendEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringbootSendEmailApplication {

	@Autowired
	private EmailSenderService senderservice;
	public static void main(String[] args) {

		SpringApplication.run(SpringbootSendEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderservice.sendEmail("jelnar9576@gmail.com",
				"Spring Email Subject",
				"This is spring boot email body..!");
	}
}
