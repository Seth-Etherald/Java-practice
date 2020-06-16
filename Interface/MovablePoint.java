/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author seth
 */
public class MovablePoint implements Movable {
    int x,y,xSpeed,ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    
    @Override
    public String toString() {
        return "Point["+x+','+y+"],Speed["+xSpeed+','+ySpeed+']';
    }
 
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    
    @Override
    public void moveDown(){
        y += ySpeed;
    }
    
    @Override
    public void moveLeft(){
        x -= xSpeed;
    }
    
    @Override
    public void moveRight(){
        x += xSpeed;
    }
    
}
