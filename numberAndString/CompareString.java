/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberAndString;

/**
 *
 * @author HP
 */
public class CompareString {
    public static void main(String[] args) {
        String varst1="Hello", varst2="Hello";
        String objst1=new String("Hello"),objst2=new String("Hello");
        char ch[]={'h','i'};
        String st2=new String(ch);
        System.out.println("varst1==varst2"+(varst1==varst2));
        System.out.println("varst1==objst1"+(varst1==objst1));
        System.out.println("objst1==objst2"+(objst1==objst2));
        System.out.println("varst1.equals(varst2)"+(varst1.equals(varst2)));
        System.out.println("varst1.equals(objst1)"+(varst1.equals(objst1)));
        System.out.println("objst1.equals(objst2)"+(objst1.equals(objst2)));
        objst1="HELLO";
         System.out.println("objst1.equals(objst2)"+(objst1.equals(objst2)));
        System.out.println("objst1.equalsIgnoreCase(objst2)"+
                (objst1.equalsIgnoreCase(objst2))); 
        
        
        
        
    }
    
}
