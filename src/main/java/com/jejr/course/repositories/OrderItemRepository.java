package com.jejr.course.repositories;

import com.jejr.course.entities.OrderItem;
import com.jejr.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
