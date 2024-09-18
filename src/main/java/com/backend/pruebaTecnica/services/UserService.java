package com.backend.pruebaTecnica.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.backend.pruebaTecnica.exceptions.HandleClientException;
import com.backend.pruebaTecnica.models.User;

public class UserService implements RequestUser {
	
	@Autowired
	RestTemplate restTemplate = new RestTemplate();
	
	private final String url = "https://jsonplaceholder.typicode.com/users";
	
	public List<User> getUsers() {
		ResponseEntity<User[]> response = this.restTemplate.getForEntity(url, User[].class);
		User[] users = response.getBody();
		return Arrays.asList(users);
	}

}
