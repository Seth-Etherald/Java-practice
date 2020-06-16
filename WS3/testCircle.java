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
public class testCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(3.5);
        System.out.println(c2);
        Circle c3 = new Circle(1.2, "blue", false);
        System.out.println(c3);
        System.out.println(c1.getArea());
    }
    
}
