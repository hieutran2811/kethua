package PointandMoveableClass;

import java.util.Arrays;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;
    private float[] XY = new float[2];

    public Point(){

    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        this.XY[0] = this.x;
        this.XY[1] = this.y;
        return XY;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return Arrays.toString(this.XY);
    }
}
