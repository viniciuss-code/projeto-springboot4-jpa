package com.viniciusscode.projeto_spring_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusscode.projeto_spring_backend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
