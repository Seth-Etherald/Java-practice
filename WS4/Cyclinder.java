/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS4;

/**
 *
 * @author seth
 */
public class Cyclinder {
    private Circle base;
    private double height;
    
    public Cyclinder(){
        base = new Circle();
        height = 1.0;
    }
    
    public Cyclinder(double radius){
        base = new Circle(radius);
        height = 1.0;
    }
    
    public Cyclinder(double radius, double height){
        base = new Circle(radius);
        this.height = height;
    }
    
    public Cyclinder(double radius, double height, String color){
        base = new Circle(radius, color);
        this.height = height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getVolume(){
        return base.getArea()*height;
    }
    
    @Override
    public String toString(){
        return "Cyclinder[Circle[radius="+base.getRadius()+",color="+base.getColor()+"],height="+this.height+']';
    }
    
}
