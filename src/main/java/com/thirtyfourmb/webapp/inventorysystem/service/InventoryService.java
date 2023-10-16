package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Inventory;

public interface InventoryService {
    List<Inventory> findAll();
}
