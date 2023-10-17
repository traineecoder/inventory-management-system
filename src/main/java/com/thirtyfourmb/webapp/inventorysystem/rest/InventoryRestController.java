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
    @GetMapping("/inventory/{itemId}")
    public Inventory findById(@PathVariable int itemId)
    {
        Inventory inventory = inventoryService.findById(itemId);
        if(inventory==null){
            throw new RuntimeException("itemId not found "+itemId);
        }
        return inventory;
    }

    @PostMapping("/inventory")
    public Inventory addItem(@RequestBody Inventory inventory){
        inventory.setItemId(0);
        return inventoryService.save(inventory);
    }

    @PutMapping("/inventory")
    public Inventory updateItem(@RequestBody Inventory inventory){
        return inventoryService.save(inventory);
    }

    @DeleteMapping("/inventory/{itemId}")
    public String deleteItem(@PathVariable int itemId){
        inventoryService.deleteById(itemId);
        return "itemId "+ itemId +" has been deleted.";
    }
}
