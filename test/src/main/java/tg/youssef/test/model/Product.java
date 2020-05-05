package tg.youssef.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
	
	private Long product_id;
	private String product_name;
	private String product_price;

}
