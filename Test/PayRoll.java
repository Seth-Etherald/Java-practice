/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.util.Scanner;
/**
 *
 * @author seth
 */
public class PayRoll {
    private static final int OVERTIME_RATE1 = 25;
    private static final int OVERTIME_RATE2 = 30;
    private static final int NORMAL_RATE = 20;

    public static void main(String[] args){
        int totalPayRoll=0;
        int numEmployees=0;
        int grossPay=0;
        int hoursWorked=0;
        int employeeID;
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee ID:");
        employeeID = input.nextInt();
        
        while(employeeID != 0){
            System.out.println("Enter hours worked:");
            hoursWorked = input.nextInt();
            if(hoursWorked > 0){
                grossPay = (hoursWorked - 40) *OVERTIME_RATE2 + 5*OVERTIME_RATE1 + 35*NORMAL_RATE;
      
            }
            else{
                if(hoursWorked > 35){
                    grossPay = (hoursWorked-35)*OVERTIME_RATE1 + 35*NORMAL_RATE;
                }
                else{
                    grossPay = hoursWorked * NORMAL_RATE;
                }
            }
        System.out.println(employeeID+","+hoursWorked+","+grossPay);
        numEmployees +=1 ;
        totalPayRoll += grossPay;
        System.out.println("Enter employee ID:");
        employeeID = input.nextInt();
        }
        
        if(numEmployees != 0){
            System.out.println("Number of pay details entered was "+numEmployees);
            System.out.println("The total pay roll cost for the data entered is $"+totalPayRoll);
        }
        else{
            System.out.println("NO EMPLOYEES ENTERED");
        }
    }
    
}
