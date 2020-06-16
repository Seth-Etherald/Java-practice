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
public class Circle {
    private double radius;
    
    public Circle(){
        radius=1.0;
    }
    public Circle(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[radius="+radius+"]";
    }
    
}
