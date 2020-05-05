package tg.youssef.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import tg.youssef.test.entity.Client;
import tg.youssef.test.feign.ProductFeign;
import tg.youssef.test.model.Product;
import tg.youssef.test.service.ClientService;



@RestController
public class ClientController {

	
	
	
	@Autowired
	private ProductFeign productFeign;
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping(path = "/clients/portfolio") 
	public List<Client> findAll() {	
		
		return clientService.findAll();
		
	}
	
	@GetMapping(path = "/client/{id}")
	public List<Client> findById(@PathVariable("id")String id){
		return clientService.findByIdd(id);
	}
	
	@GetMapping(path = "products/list")
	public List<Product> getListOfProduct(){
		return productFeign.getProductList();
	}
	
	@PostMapping(path = "/client/add")
	public void addClient(@RequestBody Client client) {
		clientService.addClient(client);
		
	}

}
