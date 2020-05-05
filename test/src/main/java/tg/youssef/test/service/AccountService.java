package tg.youssef.test.service;

import tg.youssef.test.dto.AppUserDTO;
import tg.youssef.test.entity.AppRole;
import tg.youssef.test.entity.AppUser;

public interface AccountService {
	
	
	public AppUser save(AppUserDTO user);
	public AppRole save (AppRole role);
	public void addRoleToUser(String username, String roleName);
	public AppUser findUserByUsername(String username);
	
	

}
