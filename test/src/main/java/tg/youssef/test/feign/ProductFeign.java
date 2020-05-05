package tg.youssef.test.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import tg.youssef.test.model.Product;


@FeignClient(value = "product", url = "http://localhost:8020")
public interface ProductFeign {
	
	
	@GetMapping(value = "/products/list")
	public List<Product> getProductList();

}
