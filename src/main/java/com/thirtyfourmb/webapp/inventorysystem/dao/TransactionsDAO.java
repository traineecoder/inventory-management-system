package com.thirtyfourmb.webapp.inventorysystem.dao;

import java.util.List;

import com.thirtyfourmb.webapp.inventorysystem.entity.Transactions;

public interface TransactionsDAO {
    List<Transactions> findAll();
}
