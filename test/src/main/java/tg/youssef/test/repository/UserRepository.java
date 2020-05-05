package tg.youssef.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tg.youssef.test.entity.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long>{
	
	public AppUser findByUsername(String username);

}
