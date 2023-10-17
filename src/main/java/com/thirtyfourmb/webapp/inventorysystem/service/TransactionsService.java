package com.thirtyfourmb.webapp.inventorysystem.service;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Transactions;

public interface TransactionsService {

    List<Transactions> findAll();
    Transactions findById(int theId);
    Transactions save(Transactions transactions);
    void deleteById(int theId);
    
}
