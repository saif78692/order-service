package com.example.Order_Service.controller;

import com.example.Order_Service.entity.Order;
import com.example.Order_Service.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepo orderRepo;

    @PostMapping
    public Order saveOrder(Order order) {
        order.setStatus("CREATED");
        return orderRepo.save(order);

    }
    @GetMapping("{/id}")
    public Order getOrder(@PathVariable Long id) {
        return orderRepo.findById(id).orElseThrow();
    }
}
