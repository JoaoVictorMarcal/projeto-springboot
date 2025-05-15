package com.cursoSpring.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpring.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
