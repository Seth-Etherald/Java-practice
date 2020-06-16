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
public class testMovable {
    public static void main(String[] args){
        MovablePoint p1 = new MovablePoint();
        System.out.println(p1);
        MovablePoint p2 = new MovablePoint(3,5);
        System.out.println(p2);
        System.out.println(p2.move());
    }
    
}
