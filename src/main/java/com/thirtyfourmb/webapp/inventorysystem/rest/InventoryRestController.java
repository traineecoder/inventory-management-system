package com.thirtyfourmb.webapp.inventorysystem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirtyfourmb.webapp.inventorysystem.entity.Inventory;
import com.thirtyfourmb.webapp.inventorysystem.service.InventoryService;

@RestController
@RequestMapping("/api")
public class InventoryRestController {
    private InventoryService inventoryService;

    //constructor injection for injecting InventoryDAO

    @Autowired
    public InventoryRestController(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }

    //return list of items from inventory
    @GetMapping("/inventory")
    public List<Inventory> findAll(){
        return inventoryService.findAll();
    }
}
