package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Suppliers;

public interface SupplierService {
    List<Suppliers> findAll();
    Suppliers findById(int theId);
    Suppliers save(Suppliers suppliers);
    void deleteById(int theId);
}
