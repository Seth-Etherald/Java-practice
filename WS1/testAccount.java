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
public class testAccount {
    public static void main(String[] args){
        Account ac1 = new Account();
        System.out.println(ac1);
        Account ac2 = new Account("190199", "Danny Lance", 17);
        System.out.println(ac2);
        ac2.transferTo(ac1,12);
        System.out.println(ac1);
        System.out.println(ac2);
    }
}