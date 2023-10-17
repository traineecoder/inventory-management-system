package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thirtyfourmb.webapp.inventorysystem.entity.Inventory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class InventoryDAOImpl implements InventoryDAO{

    private EntityManager entityManager;

    @Autowired
    public InventoryDAOImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }
    @Override
    public List<Inventory> findAll() {
        TypedQuery<Inventory> theQuery = entityManager.createQuery("from Inventory",Inventory.class);

        //execute Query
        List<Inventory> inventory =theQuery.getResultList();

        //return the list
        return inventory;
    }
    @Override
    public Inventory findById(int theId) {
        return entityManager.find(Inventory.class, theId);
    }
    @Override
    public Inventory save(Inventory inventory) {
        return entityManager.merge(inventory);
    }
    @Override
    public void deleteById(int theId) {
        Inventory inventory = entityManager.find(Inventory.class,theId);
        entityManager.remove(inventory);
    }
    
}