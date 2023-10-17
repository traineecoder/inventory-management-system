package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Orders;

public interface OrdersService {
    List<Orders> findAll();
    Orders findById(int theId);
    Orders save(Orders orders);
    void deleteById(int theId);
}
