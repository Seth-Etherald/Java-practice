/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS2;
import WS2.Author;


/**
 *
 * @author seth
 */
public class Book {
    private String name;
    private Author[] authors;
    double price;
    int qty=0;
    
    public Book(String name, Author[] authors, double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthors(){
        return this.authors;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double newPrice){
        this.price=newPrice;
        
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int newQty){
        this.qty=newQty;
        
    }
    @Override
    public String toString() {
		return "'" + this.name + "' by " + authors.length + " author(s)";
	}
	
	public void comma() {
		System.out.print(", ");
	}
	
	public void printAuthors() {
		for(int i = 0;i<this.getAuthors().length - 1;++i) {
			if(this.getAuthors()[i] != null) {
				System.out.print(this.getAuthors()[i]);
				if(this.getAuthors()[i + 1] != null) {
					comma();
				}
			} else {
				System.out.print("");
			}
		}
		if(this.getAuthors()[this.getAuthors().length -1] != null) {
			System.out.print(this.getAuthors()[this.getAuthors().length -1]);
		} else {
			System.out.print("");
		}
	}
   
    
 
}
