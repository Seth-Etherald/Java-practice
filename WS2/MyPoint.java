/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS2;

/**
 *
 * @author seth
 */
public class MyPoint {
    private int x=0;
    private int y=0;
    
    public MyPoint(){
        this.x=11;
        this.y=12;
    }    
    
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public int[] getXY(){
        int[]arr= new int[2];
        arr[0]=this.x;
        arr[1]=this.y;
        return arr;
    }
    
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    
    public double distance(int x, int y){
        int xDiff=this.x-x;
        int yDiff=this.y-y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    
    public double distance(MyPoint another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    public double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
       
}
