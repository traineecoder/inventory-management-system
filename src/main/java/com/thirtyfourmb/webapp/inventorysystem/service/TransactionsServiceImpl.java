package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thirtyfourmb.webapp.inventorysystem.dao.TransactionsDAO;
import com.thirtyfourmb.webapp.inventorysystem.entity.Transactions;

@Service
public class TransactionsServiceImpl implements TransactionsService {

    private TransactionsDAO transactionsDAO;

    @Autowired
    public TransactionsServiceImpl(TransactionsDAO transactionsDAO){
        this.transactionsDAO = transactionsDAO;
    }

    @Override
    public List<Transactions> findAll() {
        return transactionsDAO.findAll();
    }

    @Override
    public Transactions findById(int theId) {
        return transactionsDAO.findById(theId);
    }

    @Transactional
    @Override
    public Transactions save(Transactions transactions) {
        return transactionsDAO.save(transactions);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        transactionsDAO.deleteById(theId);
    }
    
}
