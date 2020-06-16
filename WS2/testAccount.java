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
public class testAccount {
    public static void main(String[] args){
        Customer cs1 = new Customer(1910, "Seth Etherald", 10);
        Account ac1 = new Account(1910, cs1,100);
        System.out.println(ac1);
        System.out.println(ac1.deposit(100));
        System.out.println(ac1.withdraw(50));
        System.out.println(ac1.withdraw(500));
    }
}
