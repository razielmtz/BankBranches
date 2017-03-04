/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;

import java.util.ArrayList;

/**
 *
 * @author Raziel 2
 */
public class Branch {
    private String name;
    private ArrayList <Customer> customers;
    
    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList <Customer>();
    } 
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public boolean addCustomer(String customerName){   
        if (findCustomer(customerName) == -1){
            this.customers.add(new Customer(customerName));
            return true;
        }
        System.out.println("There is already a customer with this name.");
        return false;
    }
    public boolean addCustomer(String customerName,double initialTransaction){   
        if (findCustomer(customerName) == -1){
            this.customers.add(new Customer(customerName,initialTransaction));
            return true;
        }
        System.out.println("There is already a customer with this specifications.");
        return false;
    }
    public int findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            if (customers.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean addTransaction(String customerName, double newTransaction){
        int pos = findCustomer(customerName);
        if (pos == -1){
            System.out.println("Customer not found");
            return false;
        }
        else{ this.customers.get(pos).addTransaction(newTransaction);
        return true;
    }
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
}
