/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author seth
 */
public class StoreItemTest {
    public static void main(String[] args){
        StoreItem s1 = new StoreItem();
        System.out.println(s1);
        StoreItem s2 = new StoreItem("A356", "A Mysterious food can", 19);
        System.out.println(s2);
        s2.increaseStockOnHand(9);
        System.out.println(s2);
    }
    
}
