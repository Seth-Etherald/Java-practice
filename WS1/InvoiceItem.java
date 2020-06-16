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
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    public InvoiceItem(){
        id = "S145";
        desc = "A random stuff";
        qty = 13;
        unitPrice = 50;      
    }
    public InvoiceItem(String itemID, String itemDesc, int itemQty, double itemUnitPrice){
        id = itemID;
        desc = itemDesc;
        qty = itemQty;
        unitPrice = itemUnitPrice;
    }
    public String getID(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int newQty){
        this.qty = newQty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double newUnitPrice){
        this.unitPrice = newUnitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    @Override
    public String toString(){
        return "InvoiceItem["+id+",desc="+desc+",qty="+qty+",unitPrice="+unitPrice+"]";
    }
}
