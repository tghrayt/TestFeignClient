package tg.youssef.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Client {

	
	@Id
	private String client_id;
	private String client_name;
	private String client_date;

	
}
