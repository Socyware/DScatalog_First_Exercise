package com.scoyware.dscatalog.first.exercise.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scoyware.dscatalog.first.exercise.entities.Client;
import com.scoyware.dscatalog.first.exercise.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();	
	} 
	
}
