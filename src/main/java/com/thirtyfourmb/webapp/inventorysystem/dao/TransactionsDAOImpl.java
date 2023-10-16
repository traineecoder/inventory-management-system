package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.thirtyfourmb.webapp.inventorysystem.entity.Transactions;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class TransactionsDAOImpl implements TransactionsDAO{

    private EntityManager entityManager;

    @Autowired
    public TransactionsDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    public List<Transactions> findAll() {
        TypedQuery<Transactions> thQuery = entityManager.createQuery("from Transactions", Transactions.class);
        List<Transactions> transactions = thQuery.getResultList();
        return transactions;
    }
    
}
