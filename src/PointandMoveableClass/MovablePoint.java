package PointandMoveableClass;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float[] Speed = new float[2];
    private float[] XY = new float[2];

    public MovablePoint(){

    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        this.Speed[0] = this.xSpeed;
        this.Speed[1] = this.ySpeed;
        return Speed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        this.XY[0] = this.x;
        this.XY[1] = this.y;
        return XY;
    }
    @Override
    public String toString(){
        return "(" + this.Speed[0] + ", " + this.Speed[1] + "), speed = ("
                + getxSpeed() + ", " + getySpeed() + ")";
    }
}
