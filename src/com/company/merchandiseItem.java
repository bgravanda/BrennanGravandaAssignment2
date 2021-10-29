package com.company;

import java.util.Scanner;

public class merchandiseItem {
    private ItemType taxibleType;
    private String Name;
    private double price;

    public merchandiseItem(String Name, double price, ItemType type){
        taxibleType = type;
        this.Name=Name;
        this.price = price;

    }
    //gets item name
    public String getName(){

        return Name;
    }
    //gets item price
    public double getPrice(){
        return price;
    }
    //gets item type
    public ItemType getType(){

        return taxibleType;
    }
}
