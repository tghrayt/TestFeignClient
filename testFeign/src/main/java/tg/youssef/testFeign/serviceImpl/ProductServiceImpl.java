package tg.youssef.testFeign.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tg.youssef.testFeign.entity.Product;
import tg.youssef.testFeign.repository.ProductRepository;
import tg.youssef.testFeign.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	private ProductRepository productRepository;
	

	@Override
	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}


	@Override
	public Product save(Product product) {
		
		return productRepository.save(product);
	}

}
