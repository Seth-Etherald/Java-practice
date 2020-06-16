/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS4;

/**
 *
 * @author seth
 */
public class testCyclinder {
    public static void main(String[] args){
        Cyclinder cy1 = new Cyclinder();
        System.out.println(cy1);
        System.out.println(cy1.getVolume());
        Cyclinder cy2 = new Cyclinder(4.5);
        System.out.println(cy2);
        Cyclinder cy3 = new Cyclinder(4.6, 1.2, "purple");
        System.out.println(cy3);
        Cyclinder cy4 = new Cyclinder(5, 2);
        System.out.println(cy4);
    }
}
