package com.example.securityResourcDemo1.Repositery;

import com.example.securityResourcDemo1.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositery extends JpaRepository<Customer,Integer> {
}
