package com.thirtyfourmb.webapp.inventorysystem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirtyfourmb.webapp.inventorysystem.entity.Orders;
import com.thirtyfourmb.webapp.inventorysystem.service.OrdersService;

@RestController
@RequestMapping("/api")
public class OrdersRestController {
    private OrdersService ordersService;

    @Autowired
    public OrdersRestController(OrdersService ordersService) {
        this.ordersService=ordersService;
    }
    //return list of items from orders
    @GetMapping("/orders")
    public List<Orders> findAll(){
        return ordersService.findAll();
    }

    @GetMapping("/orders/{orderId}")
    public Orders findById(@PathVariable int orderId){
        return ordersService.findById(orderId);
    }

    @PostMapping("/orders")
    public Orders addOrder(@RequestBody Orders orders) {
        orders.setId(0);
        return ordersService.save(orders);
    }

    @PutMapping("/orders")
    public Orders updateOrder(@RequestBody Orders orders) {
        return ordersService.save(orders);
    }

    @DeleteMapping("/orders/{orderId}")
    public String deleteOrder(@PathVariable int orderId) {
        ordersService.deleteById(orderId);
        return "Order " + orderId +" has been deleted.";
    }

}
