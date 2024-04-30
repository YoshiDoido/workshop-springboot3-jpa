package com.fatecdiadema.course.repositories;

import com.fatecdiadema.course.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
