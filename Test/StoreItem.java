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
public class StoreItem {
    private String itemCode;
    private String itemName;
    private int stockOnHand;
    
    public StoreItem(){
        itemCode="NO_CODE";
        itemName="NO_NAME";
        stockOnHand=0;
    }
    public StoreItem(String itemCode, String itemName, int stockOnHand){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.stockOnHand=stockOnHand;
    }
    public String getIC(){
        return this.itemCode;
    }
    public void setIC(String itemCode){
        this.itemCode=itemCode;
    }
    public String getIN(){
        return this.itemName;
    }
    public void setIN(String itemName){
        this.itemName=itemName;
    }
    public int getStock(){
        return this.stockOnHand;
    }
    public void setStock(int stockOnHand){
        this.stockOnHand=stockOnHand;
    }
    public void increaseStockOnHand(int amount){
    /*
    * PRE : None
    * POST: Has increased the stock on hand amount by amount
    */
    stockOnHand += amount;
    }

    @Override
    public String toString() {
        return "StoreItem[" + "itemCode=" + itemCode + ", itemName=" + itemName + ", stockOnHand=" + stockOnHand + ']';
    }
    
}
