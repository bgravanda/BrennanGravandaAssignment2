package com.company;

public class merchandiseItem {
    private ItemType taxibleType;
    private String Name;
    private double price;

    public merchandiseItem(String Name, double price, ItemType type){
        taxibleType = type;
        this.Name=Name;
        this.price = price;

    }
    public String getName(){
        return Name;
    }
    public double getPrice(){
        return price;
    }
    private ItemType getType(){
        return taxibleType;
    }
}
