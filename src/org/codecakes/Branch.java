package org.codecakes;

import java.util.ArrayList;

public class Branch {
    private String name;
    ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
    Branch(String name){
        this.name = name;
    }
    public void addCustomer(Customer customer, double transaction){
        customerArrayList.add(customer);
        customer.transactionArrayList.add(transaction);
    }

    public void addTransaction(double transaction, String customerName){

        Customer customer;

//            if(customerArrayList.get(i).getName().equals(customer.getName())){
//                System.out.println("Customer is adding " + transaction);
//                customer.transactionArrayList.add(transaction);
//
//                customerExists = true;
//                break;
//            }
        int index = findCustomer(customerName);
        if(index >= 0){
         customer = customerArrayList.get(index);
         customer.transactionArrayList.add(transaction);
       customer.printTransactions();
        } else{
            System.out.println("Customer not added ");
        }




    }

    public int findCustomer(String customerName){
        for(int i = 0; i< customerArrayList.size(); i++){
            if(customerArrayList.get(i).getName().equals(customerName)){
                return i;
            }
        }
        return -1;
    }


}
