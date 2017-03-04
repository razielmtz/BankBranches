/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;

/**
 *
 * @author Raziel 2
 */
public class BankBranches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank("Banco");
        bank.addBranch("ITIC");
        bank.addCustomer("ITIC","Raziel", 10.00);
        bank.addCustomer("ITIC","Beto", 20.00);
        bank.addTransaction("ITIC","Raziel", 30.00);
        bank.addTransaction("ITIC","Beto", 40.00);

        bank.addBranch("Maestros");
        bank.addCustomer("Maestros", "Leon", 200.00);

        bank.listCustomers("ITIC", true);
        bank.listCustomers("Maestros", true);

    }
    
}
