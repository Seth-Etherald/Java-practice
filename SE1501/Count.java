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
public class Count {
    public static int countWordsUsingSplit(String input){
        if (input == null || input.isEmpty()){
            return 0;
        }
        
        String[] words = input.split("\\s+");
        return words.length;
    }
            
}
