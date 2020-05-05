package tg.youssef.test.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.authentication.UserServiceBeanDefinitionParser;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tg.youssef.test.dto.AppUserDTO;
import tg.youssef.test.entity.AppRole;
import tg.youssef.test.entity.AppUser;
import tg.youssef.test.helper.AppUserHelper;
import tg.youssef.test.repository.RoleRepository;
import tg.youssef.test.repository.UserRepository;
import tg.youssef.test.service.AccountService;


@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private AppUserHelper appUserHelper;
	
	@Override
	public AppUser save(AppUserDTO userDTO) {
		AppUser user = appUserHelper.register(userDTO);
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		addRoleToUser(user.getUsername(), "USER");
		return user;
	}

	@Override
	public AppRole save(AppRole role) {
		
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		AppRole role = roleRepository.findByRoleName(roleName);
		AppUser user = userRepository.findByUsername(username);
		user.getRoles().add(role);
		
	}

	@Override
	public AppUser findUserByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}
	

}
