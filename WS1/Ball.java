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
public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    
    public Ball(){
        x=11;
        y=12;
        radius=4;
        xDelta=-2;
        yDelta=-3;
    }
    public Ball(float ux, float uy, int uRadius, int speed, int direction){
        x=ux;
        y=uy;
        radius=uRadius;
        xDelta=speed;
        yDelta=speed;
    }
    public float getX(){
        return x;
    }
    public void setX(float newX){
        this.x=newX;
    }
    public float getY(){
        return y;
    }
    public void setY(float newY){
        this.y=newY;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int newRadius){
        this.radius=newRadius;
    }
    public float getXDelta(){
        return xDelta;
    }
    public void setXDelta(float newXDelta){
        this.xDelta=newXDelta;
    }
    public float getYDelta(){
        return yDelta;
    }
    public void setYDelta(float newYDelta){
        this.yDelta=newYDelta;
    }
    public void move(){
        this.x=this.x+this.xDelta;
        this.y=this.y+this.yDelta;
    }
    public void reflecHorizontal(){
        xDelta= -xDelta;
    }
    public void reflectVertical(){
        yDelta= -yDelta;
    }
    @Override
    public String toString(){
        return "Ball[("+this.getX()+","+this.getY()+"),speed=("+this.getXDelta()+","+this.getYDelta()+")]";
    }
}
