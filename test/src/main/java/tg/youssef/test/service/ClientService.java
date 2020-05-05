package tg.youssef.test.service;

import java.util.List;

import tg.youssef.test.entity.Client;

public interface ClientService {

	
	
	public List<Client> findAll();
	public List<Client> findByIdd(String id);
	public Void addClient(Client client);
}
