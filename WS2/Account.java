/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS2;

/**
 *
 * @author seth
 */
public class Account {
    private int ID;
    private Customer customer;
    private double balance=0.0;
    
    public Account(int ID, Customer customer, double balance){
        this.ID=ID;
        this.customer=customer;
        this.balance=balance;
    }
    
    public Account(int ID, Customer customer){
        this.ID=ID;
        this.customer=customer;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    @Override
    public String toString(){
        String formattedBalance=String.format("%.2f", this.balance);
        return customer.toString() + " balance=$"+formattedBalance;
    }
    
    public String getCustomerName(){
        return customer.getName();
    }
    
    public Account deposit(double amount){
        this.balance += amount;
        return this;
    }
    
    public Account withdraw(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
        }
        else{
            System.out.println("Amount withdraw exceeds the current balance");
        }
        return this;
    }

}
