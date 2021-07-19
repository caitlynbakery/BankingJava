package org.codecakes;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactionArrayList = new ArrayList<Double>();

    Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printTransactions(){
        for(int i = 0; i<transactionArrayList.size(); i++){
            System.out.println(this.name + " " + transactionArrayList.get(i));
        }
    }
}
