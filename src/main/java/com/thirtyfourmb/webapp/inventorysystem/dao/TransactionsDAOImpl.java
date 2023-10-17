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
    @Override
    public Transactions findById(int theId) {
        return entityManager.find(Transactions.class,theId);
    }
    @Override
    public Transactions save(Transactions transactions) {
        return entityManager.merge(transactions);
    }
    @Override
    public void deleteById(int theId) {
        Transactions transactions = entityManager.find(Transactions.class,theId);
        entityManager.remove(transactions);
    }
    
}
