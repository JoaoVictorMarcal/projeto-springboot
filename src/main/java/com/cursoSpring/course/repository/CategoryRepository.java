package com.cursoSpring.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
