package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thirtyfourmb.webapp.inventorysystem.entity.Orders;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class OrdersDAOImpl implements OrdersDAO{

    private EntityManager entityManager;

    @Autowired
    public OrdersDAOImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    public List<Orders> findAll() {
        TypedQuery<Orders> thQuery = entityManager.createQuery("from Orders", Orders.class);
        List<Orders> orders = thQuery.getResultList();
        return orders;
    }

    @Override
    public Orders findById(int theId) {
        return entityManager.find(Orders.class,theId);
    }

    @Override
    public Orders save(Orders orders) {
        return entityManager.merge(orders);
    }

    @Override
    public void deleteById(int theId) {
        Orders orders = entityManager.find(Orders.class,theId);
        entityManager.remove(orders);
    }

}