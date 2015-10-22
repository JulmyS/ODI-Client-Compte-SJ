/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.app;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;

/**
 *
 * @author thierry.hubmann
 */
public class Application {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Thierry", "Hubmann");
        Customer customer2 = new Customer(2, "Bob", "L'eponge");
        Customer customer3 = new Customer(3, "Jenifer", "Aniston");
        
        customer1.addAccount("2001-1001", "Compte epargne", 0.235);
        customer1.addAccount("2001-1002", "Compte courrant", 0.098);
        
        customer2.addAccount("2002-1001", "Compte société", 0.123);
        
        customer3.addAccount("2003-1001", "Compte courrant", 0.098);
        
        Account account1 = customer1.getAccountByNumber("2001-1001");
        System.out.println(account1.getBalance());
        account1.credit(200);
        System.out.println(account1.getBalance());
        
        Account account2 = customer2.getAccountByNumber("2002-1001");
        account2.credit(500);
        account2.debit(300);
        System.out.println(account2.getBalance());
        
        Account.transfert(100, account1, account2);
        
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        
        
        
    }
    
}
