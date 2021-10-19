package com.company;

import java.util.ArrayList;

public class BusinessCustomer extends Customer{
    private double purchaseOrderBalance;
    private int PersonID;
    private String CustName;
    public  double payForOrder(ArrayList<ItemsForSale> itemsInOrder);
    public void arrangeDelivery(){
        var person = new Customer(CustName,PersonID);
        System.out.println("this order will be for "+person+" and it will be payed with a purchase order");
    }
}
