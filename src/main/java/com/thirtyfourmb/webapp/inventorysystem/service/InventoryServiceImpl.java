package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirtyfourmb.webapp.inventorysystem.dao.InventoryDAO;
import com.thirtyfourmb.webapp.inventorysystem.entity.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService{
    private InventoryDAO inventoryDAO;

    public InventoryServiceImpl(){
        
    }

    @Autowired
    public InventoryServiceImpl(InventoryDAO inventoryDAO){
        this.inventoryDAO = inventoryDAO;
    }

    @Override
    public List<Inventory> findAll() {
        return inventoryDAO.findAll();
    }
    
}
