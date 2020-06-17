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
public class TestResizbleCircle {
    public static void main(String[] args) {
        GeometricObject geomObj1 = new CircleG(5.0);
        System.out.println(geomObj1);
        System.out.println("Perimeter = "+geomObj1.getPerimeter());
        System.out.println("Area = "+geomObj1.getArea());

        Resizable geomObj2 = new ResizableCircle(5.0);
        System.out.println(geomObj2);
 
        geomObj2.resize(50);
        System.out.println(geomObj2);

        GeometricObject geomObj3 = (GeometricObject) geomObj2;
        System.out.println(geomObj3);
        System.out.println("Perimeter = "+geomObj3.getPerimeter());
        System.out.println("Area = "+geomObj3.getArea());
    }    
    
}
