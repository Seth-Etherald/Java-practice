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
public class testTriangle {
    public static void main(String[] args){
        MyTriangle t1 = new MyTriangle(3,4,5,6,7,8);
        System.out.println(t1);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.printType());
    }
    
}
