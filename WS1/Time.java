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
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(){
        hour=4;
        minute=20;
        second=0;
    }
    public Time(int uHour, int uMinute, int uSecond){
        hour=uHour;
        minute=uMinute;
        second=uSecond;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int newHour){
        this.hour=newHour;
    }
    public void setMinute(int newMinute){
        this.minute=newMinute;
    }
    public void setSecond(int newSecond){
        this.second=newSecond;
    }
    public void setTime(int newHour, int newMinute, int newSecond){
        this.hour=newHour;
        this.minute=newMinute;
        this.second=newSecond;
    }
    @Override
    public String toString(){
        String formattedHour=String.format("%02d", hour);
        String formattedMinute=String.format("%02d", minute);
        String formattedSecond=String.format("%02d", second);
        return formattedHour+":"+formattedMinute+":"+formattedSecond;
    }
    public Time nextSecond(){
        second=second+1;
        return this;
    }
    public Time previousSecond(){
        second=second-1;
        return this;
    }
}
