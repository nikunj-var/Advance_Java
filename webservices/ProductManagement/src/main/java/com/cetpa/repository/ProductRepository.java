package com.cetpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cetpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	List<Product> findByName(String name);
	
	

	@Query("from product where name=:arg1 and brand=:arg2")
	List<Product> findByNameAndBrand(@Param("arg1") String name,@Param("arg2") String brand);
}
