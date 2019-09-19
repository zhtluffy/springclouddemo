package com.itszt.orderservice_provider.controller;

import com.itszt.basespringclouddemo.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderProviderResource {

    @GetMapping("/order/{userId}")
    public Order getOrder(@PathVariable("userId") String userId){

        Order order = new Order();
        order.setDetail("detail--->"+userId);
        order.setId("orderid--->"+userId);

        return order;
    }
}
