/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE1501;
import java.util.Scanner;
/**
 *
 * @author Seth
 */
public class testCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = input.nextLine();
        System.out.println(Case.capitalize(str));
    }
}
