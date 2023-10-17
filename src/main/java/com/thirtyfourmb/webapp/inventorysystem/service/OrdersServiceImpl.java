package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirtyfourmb.webapp.inventorysystem.dao.OrdersDAO;
import com.thirtyfourmb.webapp.inventorysystem.entity.Orders;

@Service
public class OrdersServiceImpl implements OrdersService{

    private OrdersDAO ordersDAO;
    
    @Autowired
    public OrdersServiceImpl(OrdersDAO ordersDAO){
        this.ordersDAO = ordersDAO;
    }
    
    @Override
    public List<Orders> findAll() {
        return ordersDAO.findAll();
    }

    @Override
    public Orders findById(int theId) {
        return ordersDAO.findById(theId);
    }
    
    @Transactional
    @Override
    public Orders save(Orders orders) {
        return ordersDAO.save(orders);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        ordersDAO.deleteById(theId);
    }
    
}
