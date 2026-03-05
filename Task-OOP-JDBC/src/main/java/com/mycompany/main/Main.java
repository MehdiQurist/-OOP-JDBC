package main;

import DAO.ConnectionDatabase;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        
        ConnectionDatabase.removeCustomer();
        ConnectionDatabase.getCustomers();
        
        
        System.out.println("please chouse updatare ot removed "    + "");
    }

}
