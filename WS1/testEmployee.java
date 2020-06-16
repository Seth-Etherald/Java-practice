/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS1;

/**
 *
 * @author seth
 */
public class testEmployee {
    public static void main(String[] args){
        Employee e1 = new Employee();
        System.out.println(e1);
        Employee e2 = new Employee(143, "Jonathan","Joestar",100);
        System.out.println(e2);
                
    }
}
