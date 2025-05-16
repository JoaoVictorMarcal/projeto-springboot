package com.cursoSpring.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
