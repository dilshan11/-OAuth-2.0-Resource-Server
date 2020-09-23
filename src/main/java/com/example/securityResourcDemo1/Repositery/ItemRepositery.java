package com.example.securityResourcDemo1.Repositery;

import com.example.securityResourcDemo1.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepositery extends JpaRepository<Item,Integer> {
}
