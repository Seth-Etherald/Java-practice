/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS6;

/**
 *
 * @author seth
 */
public class CircleG implements GeometricObject {

    protected double radius = 1.0;
    

    public CircleG(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    @Override
    public String toString() {
        return String.format("Circle with radius = %1$f", radius);
    }

}
