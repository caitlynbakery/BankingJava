package org.codecakes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Branch palo_alto = new Branch("Palo Alto");
        Customer caitlyn = new Customer("Caitlyn");
        Customer bobby = new Customer("bobby");
        palo_alto.addCustomer(caitlyn, 100.0);
        palo_alto.addCustomer(bobby, 23.0);
        palo_alto.addTransaction(29.0, "Caitlyn");
        palo_alto.addTransaction(33.0, "bobby");
    }
}
