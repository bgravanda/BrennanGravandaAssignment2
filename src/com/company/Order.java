package com.company;

import java.util.ArrayList;

public class Order {
    private ShippingAddress destination;
    private Customer orderedBy;
    private ArrayList<merchandiseItem>cartForOrder;
    public Order(ShippingAddress dest, Customer orderer,ArrayList<merchandiseItem> cart){
        destination = dest;
        orderedBy = orderer;
        cartForOrder= cart ;

    }
    public String getOrderedBy(){
        var newOrder = orderedBy.toString();
        return newOrder;
    }
    public String getDestination(){
        var newDestination=destination.toString();
        return newDestination;
    }

}
