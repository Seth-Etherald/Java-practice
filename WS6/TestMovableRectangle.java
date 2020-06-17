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
public class TestMovableRectangle {
    public static void main(String[] args)
    {
        Movable m1 = new MovableRectangle(0, 0, 50, 50, 10, 10); 
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
           
        Movable m2 = new MovableRectangle(20, 20, 80, 80, 5, 5); 
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
    
}
