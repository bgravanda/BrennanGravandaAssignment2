package com.company;

import java.util.ArrayList;

public class ResidentialCustomer extends Customer {
    public ResidentialCustomer(String customerName, Integer custID) {
        super(customerName, custID);
    }
// gets the sum and applies tax
    public double payForOrder(ArrayList<merchandiseItem> itemsInOrder) {
        double sum = 0.0;
        for (var item : itemsInOrder){
            if(item.getType() == ItemType.WICFood) {
                sum += item.getPrice();
            }
            if(item.getType()==ItemType.Clothing){
                sum += item.getPrice();
                if(sum>=175){
                    var taxedAmount = sum-175;
                    var tax = taxedAmount*.0625;
                    sum = sum + tax;
                }
            }
            if(item.getType()==ItemType.GeneralMerchandise){
                sum += item.getPrice();
                var tax = sum*.0625;
                sum = sum+tax;
            }
        }
        return sum;
    }
}