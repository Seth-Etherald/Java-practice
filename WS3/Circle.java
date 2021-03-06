/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS3;

/**
 *
 * @author seth
 */
public class Circle extends Shape {
    private double radius = 1.0;
    
    public Circle(){
        super();
    }
    
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + ']';
    }
  
}
