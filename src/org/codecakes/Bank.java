package org.codecakes;

import java.util.ArrayList;

public class Bank {
    ArrayList<Branch>branchesArrayList = new ArrayList<Branch>();

    public void addNewBranch(Branch branch){
        if (findBranch(branch.getName()) < 0){
            System.out.println("Adding " + branch.getName());
            branchesArrayList.add(branch);
        } else{
            System.out.println("branch already exists");
        }

    }

    private int findBranch(String branchName){
        for(int i = 0; i< branchesArrayList.size(); i++){
            if(branchesArrayList.get(i).getName().equals(branchName)){
                return i;
            }
        }
        return -1;
    }

    public void addTransaction(double transaction, String customerName, String branchName){
        int index = findBranch(branchName);
        if(index >= 0){
            Branch branch = branchesArrayList.get(index);
            int customerIndex = branch.findCustomer(customerName);
            if(customerIndex >= 0){
                branch.addTransaction(transaction, customerName);
                System.out.println("adding " + transaction + " to " + customerName);
            } else{
                System.out.println("Customer does NOT exist");
            }
        }else {
            System.out.println("Branch does not exist");
        }

    }

    public void printCustomer(){
        for(int i = 0; i<branchesArrayList.size(); i++){
            System.out.println(branchesArrayList.get(i).getName());
        }
    }


}
