package tg.youssef.test.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tg.youssef.test.entity.Client;
import tg.youssef.test.repository.ClientRepository;
import tg.youssef.test.service.ClientService;


@Service
public class ClientServiceImpl implements ClientService{
	
	
	@Autowired
	ClientRepository clientRepository;

	

	public List<Client> findAll() {
		return clientRepository.findAll();
	}



	@Override
	public List<Client> findByIdd(String id) {
		
		return clientRepository.findByIdd(id);
	}



	@Override
	public Void addClient(Client client) {
		  clientRepository.save(client);
		return null;
	}

}
