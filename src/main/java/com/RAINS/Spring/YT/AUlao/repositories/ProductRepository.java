package com.RAINS.Spring.YT.AUlao.repositories;

import com.RAINS.Spring.YT.AUlao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}

