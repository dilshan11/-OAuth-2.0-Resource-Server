package com.example.securityResourcDemo1.Repositery;

import com.example.securityResourcDemo1.Entity.Orderdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderdetailsRepositery extends JpaRepository<Orderdetails,Integer> {
}
