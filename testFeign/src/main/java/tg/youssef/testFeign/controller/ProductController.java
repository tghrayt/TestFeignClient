package tg.youssef.testFeign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tg.youssef.testFeign.entity.Product;
import tg.youssef.testFeign.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	
	@GetMapping(path = "/list")
	public List<Product> getProductList() {
		
		return productService.getProducts();
		
	}

}
