package tg.youssef.test.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tg.youssef.test.dto.AppUserDTO;
import tg.youssef.test.entity.AppUser;
import tg.youssef.test.mapper.AppUserMapper;
import tg.youssef.test.service.AccountService;


@Service
public class AppUserHelper {

	@Autowired
	private AccountService accountService;
	@Autowired
	private AppUserMapper appUserMapper;

	public AppUser register(AppUserDTO appUserDTO) {

		if (!appUserDTO.getPassword().equals(appUserDTO.getRepassword())) {
			throw new RuntimeException("You must confirm youe password");
		}
		AppUser user = accountService.findUserByUsername(appUserDTO.getUsername());
		if (user != null) {
         throw new RuntimeException("This user already exists");
		}
		
		return appUserMapper.dtoTOEntity(appUserDTO);
	}

}
