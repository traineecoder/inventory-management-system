package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Inventory;

public interface InventoryDAO {
    List<Inventory> findAll();
}
