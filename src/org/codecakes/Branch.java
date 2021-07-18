package org.codecakes;

import java.util.ArrayList;

public class Branch {
    private String name;
    ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
    Branch(String name){
        this.name = name;
    }
    private void addCustomer(Customer customer, double transaction){
        customerArrayList.add(customer);
        customer.transactionArrayList.add(transaction);
    }
}
