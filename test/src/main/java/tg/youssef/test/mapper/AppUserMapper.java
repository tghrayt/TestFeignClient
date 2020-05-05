package tg.youssef.test.mapper;

import org.springframework.stereotype.Service;

import tg.youssef.test.dto.AppUserDTO;
import tg.youssef.test.entity.AppUser;

@Service
public class AppUserMapper {
	
	
	public AppUser dtoTOEntity(AppUserDTO appUserDTO) {
		AppUser user =new AppUser();
		user.setUsername(appUserDTO.getUsername());
		user.setPassword(appUserDTO.getPassword());
		return user;
	}
	
	public AppUserDTO entityToDto(AppUser appUser) {
		AppUserDTO userDTO = new AppUserDTO();
		userDTO.setUsername(appUser.getUsername());
		userDTO.setPassword(appUser.getPassword());
		
		return null;
	}

}
