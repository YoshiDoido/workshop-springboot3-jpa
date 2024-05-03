package com.fatecdiadema.course.repositories;

import com.fatecdiadema.course.entities.OrderItem;
import com.fatecdiadema.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
