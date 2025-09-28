package com.example.Order_Service.repository;

import com.example.Order_Service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo  extends JpaRepository<Order,Long> {
}
