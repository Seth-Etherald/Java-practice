/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberAndString;
import java.util.Scanner;

/**
 *
 * @author seth
 */
public class Initials {
    public static void printInitials(String name){
        if (name.length() == 0)
        return;
        
        System.out.println(Character.toUpperCase(name.charAt(0)));
        
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.println("" +Character.toUpperCase(name.charAt(i+1)));
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = input.nextLine();
        printInitials(name);
    }
}
