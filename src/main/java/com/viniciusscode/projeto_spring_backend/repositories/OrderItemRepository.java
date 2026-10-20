package com.viniciusscode.projeto_spring_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciusscode.projeto_spring_backend.entities.OrderItem;
import com.viniciusscode.projeto_spring_backend.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
