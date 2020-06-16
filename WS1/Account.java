/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS1;

/**
 *
 * @author seth
 */
public class Account {
    private String id;
    private String name;
    private int balance=0;
    
    public Account(){
        id="just pretend this is a random string of numbers and characters";
        name="Seth Etherald";
    }
    public Account(String aId, String aName, int aBalance){
        id=aId;
        name=aName;
        balance=aBalance;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }
    public int debit(int amount){
        if(amount <=balance){
            balance = balance - amount;
        }
        else {
            System.out.println("amount exceed");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount <=balance){
            another.credit(amount);
            this.debit(amount);
        }
        else{
            System.out.println("amount exceeded");
        }
        return balance;
    }
    @Override
    public String toString(){
        return "Account[id="+id+",name="+name+",balance="+balance+"]";
    }
}
