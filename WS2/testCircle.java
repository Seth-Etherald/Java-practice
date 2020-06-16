/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS2;

/**
 *
 * @author seth
 */
public class testCircle {
    public static void main(String[] args){
        MyCircle c1=new MyCircle();
        System.out.println(c1);
        MyCircle c2=new MyCircle(3,4,5);
        System.out.println(c2.distance(c1));
    }
}
