package com.example.securityResourcDemo1.Repositery;

import com.example.securityResourcDemo1.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositery extends JpaRepository<Order,Integer> {
}
