/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

/**
 *
 * @author thierry.hubmann
 */
public class Bank {
    int number;
    String name;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
    }
    
    public Account getAccountByNumber(int number){
        return null;
    }
    
    public Customer getCustomerByNumber(int number){
        return null;
    }
    
    public void addCustomer(){
        
    }
    
    public void addAccount(){
        
    }
}
