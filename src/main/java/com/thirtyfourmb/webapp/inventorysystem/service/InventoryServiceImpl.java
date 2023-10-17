package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirtyfourmb.webapp.inventorysystem.dao.InventoryDAO;
import com.thirtyfourmb.webapp.inventorysystem.entity.Inventory;


@Service
public class InventoryServiceImpl implements InventoryService{
    private InventoryDAO inventoryDAO;

    @Autowired
    public InventoryServiceImpl(InventoryDAO inventoryDAO){
        this.inventoryDAO = inventoryDAO;
    }

    @Override
    public List<Inventory> findAll() {
        return inventoryDAO.findAll();
    }

    @Override
    public Inventory findById(int theId) {
        return inventoryDAO.findById(theId);
    }

    @Transactional
    @Override
    public Inventory save(Inventory inventory) {
        return inventoryDAO.save(inventory);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        inventoryDAO.deleteById(theId);
    }
    
}
