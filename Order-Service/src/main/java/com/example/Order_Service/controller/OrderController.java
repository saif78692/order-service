package com.example.Order_Service.controller;

import com.example.Order_Service.entity.Orders;
import com.example.Order_Service.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepo orderRepo;

    @PostMapping
    public Orders saveOrder(Orders order) {
        order.setStatus("CREATED");
        return orderRepo.save(order);

    }
    @GetMapping("/{id}")
    public Orders getOrder(@PathVariable Long id) {
        return orderRepo.findById(id).orElseThrow();
    }
}
