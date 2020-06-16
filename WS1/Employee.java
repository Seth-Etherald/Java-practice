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
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee(){
        id = 13;
        firstName = "Seth";
        lastName = "Etherald";
        salary = 50;
    }
    public Employee(int eId, String eFirstName, String eLastName, int eSalary){
        id =eId;
        firstName=eFirstName;
        lastName=eLastName;
        salary=eSalary;
                
    }
    public int getID(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName+" "+lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int newSalary){
        this.salary = newSalary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return salary*((100+percent)/100);
    }
    @Override
    public String toString(){
        return "Employee[id="+id+",name="+firstName+" "+lastName+",salary="+salary+"]";
    }
}
