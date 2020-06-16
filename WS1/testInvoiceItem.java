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
public class testInvoiceItem {
    public static void main(String[] args){
        InvoiceItem i1 = new InvoiceItem();
        System.out.println(i1);
        InvoiceItem i2 = new InvoiceItem("D12", "a new random stuff", 12, 13.50);
        System.out.println(i2);
    }
}
