package com.viniciusscode.projeto_spring_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusscode.projeto_spring_backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
