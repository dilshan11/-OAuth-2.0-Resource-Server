package com.example.securityResourcDemo1.Repositery;

import com.example.securityResourcDemo1.Entity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepositery extends JpaRepository<CustomerDetails,Integer> {
}
