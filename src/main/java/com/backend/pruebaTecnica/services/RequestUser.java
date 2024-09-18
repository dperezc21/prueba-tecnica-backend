package com.backend.pruebaTecnica.services;

import java.util.List;

import com.backend.pruebaTecnica.exceptions.HandleClientException;
import com.backend.pruebaTecnica.models.User;

public interface RequestUser {
	
	public List<User> getUsers() throws HandleClientException;

}
