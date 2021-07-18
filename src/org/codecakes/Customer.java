package org.codecakes;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactionArrayList = new ArrayList<Double>();

    Customer(String name){
        this.name = name;
    }
}
