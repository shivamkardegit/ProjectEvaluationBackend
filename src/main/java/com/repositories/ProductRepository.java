package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beanfiles.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}