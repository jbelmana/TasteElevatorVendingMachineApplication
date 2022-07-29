package com.techelevator.item;

import java.math.BigDecimal;

public abstract class Item {
    private String itemName;
    private String slotIdentifier;
    private BigDecimal price;
    private int quantityAvailable;

    public Item(String itemName, String slotIdentifier, BigDecimal price, int quantityAvailable) {
        this.itemName = itemName;
        this.slotIdentifier = slotIdentifier;
        this.price = price;
        quantityAvailable = 6;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSlotIdentifier() {
        return slotIdentifier;
    }

    public void setSlotIdentifier(String slotIdentifier) {
        this.slotIdentifier = slotIdentifier;
    }

    public BigDecimal getPrice() {
        return price;                                   //might need new math
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public abstract String getMessage();
}
