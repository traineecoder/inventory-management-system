package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Orders;

public interface OrdersDAO {
    List<Orders> findAll();
}
