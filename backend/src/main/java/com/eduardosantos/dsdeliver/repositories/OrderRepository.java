package com.eduardosantos.dsdeliver.repositories;

import com.eduardosantos.dsdeliver.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
