package com.thirtyfourmb.webapp.inventorysystem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirtyfourmb.webapp.inventorysystem.entity.Transactions;
import com.thirtyfourmb.webapp.inventorysystem.service.TransactionsService;

@RestController
@RequestMapping("/api")
public class TransactionsRestController {
    private TransactionsService transactionsService;

    @Autowired
    public TransactionsRestController(TransactionsService transactionsService)
    {
        this.transactionsService = transactionsService;
    }

    @GetMapping("/transactions")
    public List<Transactions> findAll(){
        return transactionsService.findAll();
    }

    @GetMapping("/transactions/{transactionId}")
    public Transactions findById(@PathVariable int transactionId) {
        return transactionsService.findById(transactionId);
    }

    @PostMapping("/transactions")
    public Transactions addTransactions(@RequestHeader Transactions transactions) {
        transactions.setTransactionId(0);
        return transactionsService.save(transactions);
    }

    @PutMapping("/transactions")
    public Transactions updateTransactions(@RequestHeader Transactions transactions) {
        return transactionsService.save(transactions);
    }

    @DeleteMapping("/transactions/{transactionId}")
    public String deleteTransactions(@PathVariable int transactionId) {
        transactionsService.deleteById(transactionId);
        return "Transactions " + transactionId + " has been Deleted.";
    }
}
