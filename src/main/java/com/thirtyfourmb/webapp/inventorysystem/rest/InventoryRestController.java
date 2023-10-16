package com.thirtyfourmb.webapp.inventorysystem.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thirtyfourmb.webapp.inventorysystem.entity.Inventory;

import com.thirtyfourmb.webapp.inventorysystem.dao.InventoryDAO;

@RestController
@RequestMapping("/api")
public class InventoryRestController {
    
    private InventoryDAO inventoryDAO;

    //constructor injection for injecting InventoryDAO

    public InventoryRestController(InventoryDAO inventoryDAO){
        this.inventoryDAO = inventoryDAO;
    }

    //return list of items from inventory
    @GetMapping("/inventory")
    public List<Inventory> findAll(){
        
        return inventoryDAO.findAll();
    }
}
