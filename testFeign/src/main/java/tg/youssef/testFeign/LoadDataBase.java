package tg.youssef.testFeign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import tg.youssef.testFeign.entity.Product;
import tg.youssef.testFeign.service.ProductService;

@Configuration
@Slf4j
public class LoadDataBase {

	
	@Bean
	CommandLineRunner initDatabase(ProductService productService){
		return args -> {
			productService.save(new Product(null, "Baggins", "burglar"));
			productService.save(new Product(null, "Baggins", "thief"));

			productService.getProducts().forEach(product -> {
				log.info("Preloaded " + product);
			});
};
	}
}