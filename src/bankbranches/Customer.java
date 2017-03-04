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
public class Customer {
    private String name;
    private ArrayList <Double> transactions;
    
    public Customer(String name){
        this.name = name;
        this.transactions.add(0.00);
    }
    public Customer(String name, double initialTransaction){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialTransaction);
    }
    public void addTransaction(double newTransaction){
        this.transactions.add(newTransaction);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }
    
}
