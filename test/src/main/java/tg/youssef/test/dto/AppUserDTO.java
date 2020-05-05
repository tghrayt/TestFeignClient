package tg.youssef.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class AppUserDTO {
	
	private String username;
	private String password;
	private String repassword;

}
