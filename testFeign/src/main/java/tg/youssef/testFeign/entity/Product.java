package tg.youssef.testFeign.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity @Data @ AllArgsConstructor @NoArgsConstructor @ToString
public class Product implements Serializable {



	private static final long serialVersionUID = 1L;
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long product_id;
	private String product_name;
	private String product_price;

}
