/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE1501;
import java.util.*;
/**
 *
 * @author Seth
 */
public class Sum {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = scan.next();
    int j = 0, z = 10;
    int [] arr = new int [str.length()];
    
    for(int i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
      {
        arr[j] = str.charAt(i) - 48;
        while(i + 1 < str.length() && str.charAt(i + 1) >= 48 && str.charAt( i + 1) <= 57)
        {
          arr[j] = z * arr[j] + str.charAt(i + 1) - 48;
          i = i + 1;
          
        }
        j = j + 1;
        z = 10;
      }
    }
    int total = 0;
    for(int i = 0; i < arr.length; i++)
    {
      total = total + arr[i];
    }
    System.out.println("The sum is: "+total);
  }
    
}
