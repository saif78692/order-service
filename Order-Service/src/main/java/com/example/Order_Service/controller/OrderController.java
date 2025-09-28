package com.example.Order_Service.controller;

import com.example.Order_Service.entity.Orders;
import com.example.Order_Service.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
//    @Autowired
//    private OrderRepo orderRepo;
    private List<Orders> ordersList = new ArrayList<>();

    @PostMapping
    public Orders saveOrder(Orders order) {
        order.setStatus("CREATED");
        ordersList.add(order);
        return  order;


    }
    @GetMapping("/{id}")
    public Orders getOrder(@PathVariable Long id) {
        return ordersList.stream().filter((order) ->order.getId() == id).findFirst().orElseThrow();
    }
}
