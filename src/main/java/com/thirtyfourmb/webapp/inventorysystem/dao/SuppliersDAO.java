package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Suppliers;

public interface SuppliersDAO {
    List<Suppliers> findAll();
    Suppliers findById(int theId);
    Suppliers save(Suppliers suppliers);
    void deleteById(int theId);
}
