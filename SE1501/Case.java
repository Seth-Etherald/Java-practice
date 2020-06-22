/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE1501;

/**
 *
 * @author Seth
 */
public class Case {
    public static String capitalize(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
            str = String.join(" ", words);
        }
        return str;
    }
}
