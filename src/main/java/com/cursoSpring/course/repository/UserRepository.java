package com.cursoSpring.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpring.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
