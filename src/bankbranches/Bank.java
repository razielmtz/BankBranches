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
public class Bank {
    private String name;
    private ArrayList<Branch> branches;
        
    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int findBranch(String name){
        for(int i=0; i<branches.size();i++){
            if(branches.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }        
        }
    return -1;
}
    public boolean addBranch(String newBranch){
        if (findBranch(name) == -1){
            this.branches.add(new Branch(newBranch));
            System.out.println("Branch " + newBranch + " added.");
            return true;
        }
        System.out.println("There is already a branch with this name.");
        return false;
    }
    public boolean addCustomer(String branchName, String customerName){
        int pos = findBranch(branchName);
        if (findBranch(branchName) != -1){
            if (pos == -1){
            this.branches.get(pos).addCustomer(customerName);
            System.out.println("Customer " + customerName + " added to Branch: " + branchName);
            return true;
            } else{
                System.out.println("There is already a customer with this specifications.");
                return false;
            }
        } else { 
            System.out.println("Branch not found");
            return false;
    }   
}
    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        int pos = findBranch(branchName);
        if (pos != -1){
            if (this.branches.get(pos).findCustomer(customerName) == -1){
            this.branches.get(pos).addCustomer(customerName, initialTransaction);
            System.out.println("Customer " + customerName + " added to Branch: " + branchName);
            return true;
            } else{
                System.out.println("There is already a customer with this specifications.");
                return false;
            }
        } else { 
            System.out.println("Branch not found");
            return false;
}
}
    public boolean addTransaction(String branchName, String customerName, double newTransaction){
        int pos = findBranch(branchName);
        if (pos != -1){
            int posCustomer = this.branches.get(pos).findCustomer(customerName);
            if (posCustomer == -1){
            System.out.println("Customer not found.");
            return false;
            } else{
            this.branches.get(pos).addTransaction(customerName, newTransaction);
            System.out.println("The transaction of the customer" + 
                    customerName + "of" + branchName +  "was completed succsesfully.");
            return true;
            }
        } else { 
            System.out.println("Branch not found");
            return false;
    }
}
    public boolean listCustomers(String branchName, boolean listTransactions){
        int pos = findBranch(branchName);
        if (pos != -1) {
            System.out.println(this.branches.get(pos).getName() + ": customers information");
            ArrayList<Customer> branchCustomers = this.branches.get(pos).getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer selectedCustomer = branchCustomers.get(i);
                System.out.println("Name: " + selectedCustomer.getName());
                if (listTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = selectedCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println((j+1) + "): " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
