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
public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;
    
    public Invoice(int ID, Customer customer, double amount){
        this.ID=ID;
        this.customer=customer;
        this.amount=amount;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public void setCustomer(Customer  customer){
        this.customer=customer;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public void setAmount(double amount){
        this.amount=amount;
    }
    
    public String getCustomerName(){
        return customer.getName();
    }
    
    public double getAmountAfterDiscount(){
        return this.amount-customer.getDiscount();
    }
    
    @Override
    public String toString(){
        return customer.toString();
    }
    
}
