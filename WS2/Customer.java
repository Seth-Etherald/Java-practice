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
public class Customer {
    private int ID;
    private String name;
    private int discount;
    private char gender;
    
    public Customer(int ID, String name, int discount){
        this.ID=ID;
        this.name=name;
        this.discount=discount;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getDiscount(){
        return this.discount;
    }
    
    public void setDiscount(int discount){
        this.discount=discount;
    }
    
    public char getGender(){
        return this.gender;
    }
    @Override
    public String toString(){
        return name+"("+ID+")";
    }
}
