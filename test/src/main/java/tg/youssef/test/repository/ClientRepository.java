package tg.youssef.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tg.youssef.test.entity.Client;




public interface ClientRepository  extends JpaRepository<Client, String>{ 
	
	
	@Query("from Client where client_id= ?1")
	List<Client> findByIdd(String id);
}
