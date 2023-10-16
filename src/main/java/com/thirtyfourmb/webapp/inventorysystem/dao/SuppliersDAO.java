package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Suppliers;

public interface SuppliersDAO {
    List<Suppliers> findAll();
}
