package tg.youssef.testFeign.service;

import java.util.List;

import tg.youssef.testFeign.entity.Product;

public interface ProductService {
	
	
	public List<Product> getProducts();
	public Product save(Product product);

}
