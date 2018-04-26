package com.itergo.scotty.contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContactsApplication {

	@RequestMapping("")
	public String hello() {
		return "Hallo Peter";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}
}
