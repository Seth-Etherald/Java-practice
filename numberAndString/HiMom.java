/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberAndString;

/**
 *
 * @author seth
 */
public class HiMom {
    public static String str1 = "Hi";
    public static String str2 = "mom";
    
    public static void main(String[] args){
        String str3 = str1.concat(str2);
        System.out.println(str3);
        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);
        System.out.println(sb);
    }
}
