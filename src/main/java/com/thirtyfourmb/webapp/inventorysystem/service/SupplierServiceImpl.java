package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirtyfourmb.webapp.inventorysystem.dao.SuppliersDAO;
import com.thirtyfourmb.webapp.inventorysystem.entity.Suppliers;

@Service
public class SupplierServiceImpl implements SupplierService {
    private SuppliersDAO suppliersDAO;
    
    @Autowired
    public SupplierServiceImpl(SuppliersDAO suppliersDAO)
    {
        this.suppliersDAO = suppliersDAO;
    }

    public List<Suppliers> findAll(){
        return suppliersDAO.findAll();
    }

    @Override
    public Suppliers findById(int theId) {
        return suppliersDAO.findById(theId);
    }

    @Transactional
    @Override
    public Suppliers save(Suppliers suppliers) {
        return suppliersDAO.save(suppliers);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        suppliersDAO.deleteById(theId);
    }
    
}
