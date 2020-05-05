package tg.youssef.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tg.youssef.test.entity.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, Long>{
	
	public AppRole findByRoleName(String roleName);

}
