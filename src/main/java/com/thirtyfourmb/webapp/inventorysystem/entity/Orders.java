package com.thirtyfourmb.webapp.inventorysystem.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int id;

    @Column(name="received_on")
    private Date itemReceivedOn;

    @Column(name="placed_on")
    private Date itemPlacedOn;

    @Column(name="received_item_name")
    private String itemName;

    @Column(name="received_item_count")
    private int itemCount;

    public Orders(){
        
    }

    public Orders(Date itemReceivedOn, Date itemPlacedOn, String itemName, int itemCount) {
        this.itemReceivedOn = itemReceivedOn;
        this.itemPlacedOn = itemPlacedOn;
        this.itemName = itemName;
        this.itemCount = itemCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getItemReceivedOn() {
        return itemReceivedOn;
    }

    public void setItemReceivedOn(Date itemReceivedOn) {
        this.itemReceivedOn = itemReceivedOn;
    }

    public Date getItemPlacedOn() {
        return itemPlacedOn;
    }

    public void setItemPlacedOn(Date itemPlacedOn) {
        this.itemPlacedOn = itemPlacedOn;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    @Override
    public String toString() {
        return "Orders [id=" + id + ", itemReceivedOn=" + itemReceivedOn + ", itemPlacedOn=" + itemPlacedOn
                + ", itemName=" + itemName + ", itemCount=" + itemCount + "]";
    }
    
    
}
