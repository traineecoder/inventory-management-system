package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thirtyfourmb.webapp.inventorysystem.entity.Suppliers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class SuppliersDAOImpl implements SuppliersDAO{

    private EntityManager entityManager;

    @Autowired
    public SuppliersDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    public List<Suppliers> findAll() {
        TypedQuery<Suppliers> theQuery = entityManager.createQuery("from Suppliers", Suppliers.class);
        List<Suppliers> suppliers = theQuery.getResultList();
        return suppliers;
    }

}
