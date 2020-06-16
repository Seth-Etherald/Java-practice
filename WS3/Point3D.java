/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author seth
 */
public class Point3D  extends Point2D {
    private float z=0.0f;
    
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }
    
    public Point3D(){
        super();
        z=11;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(), super.getY(), this.z};
    }
    @Override
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+z+")";
    }
}
