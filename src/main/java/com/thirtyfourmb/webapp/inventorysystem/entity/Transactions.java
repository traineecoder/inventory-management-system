package com.thirtyfourmb.webapp.inventorysystem.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transaction_id")
    private int transactionId;

    @Column(name="date")
    private Date date;

    @Column(name="paid_amount")
    private int paidAmount;

    public Transactions(){
        
    }

    public Transactions(Date date, int paidAmount) {
        this.date = date;
        this.paidAmount = paidAmount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Override
    public String toString() {
        return "Transactions [transactionId=" + transactionId + ", date=" + date + ", paidAmount=" + paidAmount + "]";
    }

}
