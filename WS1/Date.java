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
public class Date {
    private int day;
    
    private int month;
    
    private int year;
   
    
    public Date(){
        day=30;
        month=12;
        year=2000;
        
    }
    public Date(int uDay, int uMonth, int uYear){
        day=uDay;
        month=uMonth;
        year=uYear;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int newDay){
        this.day=newDay;
    }
    public void setMonth(int newMonth){
        this.month=newMonth;
    }
    public void setYear(int newYear){
        this.year=newYear;
    }
    public void setDate(int newDay, int newMonth, int newYear){
        this.day=newDay;
        this.month=newMonth;
        this.year=newYear;
    }
    @Override
    public String toString(){
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        return formattedDay+"/"+formattedMonth+"/"+year;
    }
}
