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
public class MyCircle {
    private MyPoint center;
    private int radius;
    private int x=0;
    private int y=0;
    
    public MyCircle(){
        center=new MyPoint(12,14);
        this.radius=10;
    }
    
    public MyCircle(int x, int y, int radius){
        center=new MyPoint(x,y);
        this.radius=radius;
    }
    
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }
    
    public int getRadius(){
        return this.radius;
    }
    
    public void setRadius(int radius){
        this.radius=radius;
    }
    
    public MyPoint getCenter(){
        return this.center;
    }
    
    public void setCenter(MyPoint center){
        this.center=center;
    }
    
    public int getCenterX(){
        return center.getX();
    }
    
    public void setCenterX(int x){
        this.x=x;
    }
    
    public int getCenterY(){
        return center.getY();
    }
    
    public void setCenterY(int y){
        this.y=y;
    }
    
    public int[] getCenterXY(){
        return center.getXY();
    }
    
    public void setCenterXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return center.toString();
    }
    
    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
