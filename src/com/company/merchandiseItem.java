package com.company;

public class merchandiseItem {
    private ItemType taxibleType;
    private String Name;
    private double price;

    public merchandiseItem merchandiseItem(String Name, double price, ItemType type){

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
