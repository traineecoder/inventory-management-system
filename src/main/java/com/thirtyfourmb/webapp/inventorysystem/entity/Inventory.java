package com.thirtyfourmb.webapp.inventorysystem.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private int itemId;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_count")
    private int itemCount;

    @Column(name="space_left")
    private int spaceLeft;

    public Inventory(){

    }

    public Inventory(String itemName, int itemCount,int spaceLeft) {
        this.itemName = itemName;
        this.itemCount = itemCount;
        this.spaceLeft = spaceLeft;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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

    public int getSpaceLeft() {
        return spaceLeft;
    }

    public void setSpaceLeft(int spaceLeft) {
        this.spaceLeft = spaceLeft;
    }

    @Override
    public String toString() {
        return "Inventory [itemId=" + itemId + ", itemName=" + itemName + ", itemCount=" + itemCount + ", spaceLeft="
                + spaceLeft + "]";
    }

    
}