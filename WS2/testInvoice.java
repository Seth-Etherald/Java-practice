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
public class testInvoice {
    public static void main(String[] args){
        Customer ctm1=new Customer(1910, "Seth", 10);
        Invoice i1=new Invoice(1910, ctm1, 90);
        System.out.println(ctm1);
        System.out.println(i1);
        System.out.println(i1.getAmountAfterDiscount());
    }
    
}
