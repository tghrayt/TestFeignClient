package tg.youssef.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tg.youssef.test.dto.AppUserDTO;
import tg.youssef.test.entity.AppUser;
import tg.youssef.test.service.AccountService;

@RestController
public class AccountController {

	
	@Autowired
	private AccountService  accountService; 
	
	@PostMapping(path = "/register")
	public AppUser register(@RequestBody AppUserDTO appUserDTO) {
		return accountService.save(appUserDTO);
	}
}
