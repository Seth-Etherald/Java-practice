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
public class Rectangle extends Shape {

    protected  double width;
    protected  double length;

    public Rectangle() {
        super();
        width  = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width  = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width  = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width+length);
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width = %f and length = %f, which is a subclass of %s"
                            , width, length, super.toString());
    }
}
