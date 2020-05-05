package tg.youssef.testFeign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tg.youssef.testFeign.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
