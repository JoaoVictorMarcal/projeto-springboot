package com.cursoSpring.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpring.course.entities.OrderItem;
import com.cursoSpring.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
