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
public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y, xSpeed, ySpeed);
        this.radius=radius;
    }
    
    @Override
    public String toString(){
        return "Circle[Center["+center+"],Radius="+radius+']';
    }
    
    @Override
    public void moveUp(){
        center.y -= center.ySpeed;
    }
    
    @Override
    public void moveDown(){
        center.y += center.ySpeed;
    }
    
    @Override
    public void moveLeft(){
        center.x -= center.xSpeed;
    }
    
    @Override
    public void moveRight(){
        center.x += center.xSpeed;
    }
}
