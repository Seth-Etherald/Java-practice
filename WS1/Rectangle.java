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
public class Rectangle {
    private float length=1.0f;
    private float width=1.0f;
    
    public Rectangle(){ 
        
    }
    public Rectangle(float l, float w){
        length = l;
        width = w;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float newLength){
        this.length=newLength;       
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float newWidth){
        this.width=newWidth;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length+width)*2;
    }
    @Override
    public String toString(){
        return "Rectangle[length=" +length+ ",width=" +width+"]";
    }
}
