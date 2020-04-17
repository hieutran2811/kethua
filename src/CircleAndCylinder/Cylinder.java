package CircleAndCylinder;

public class Cylinder extends Circle {
    double height;
    static int cylinderCounter;

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }
    @Override
    public String toString(){
        return "Hình trụ " + cylinderCounter + " có: Bán kính đáy: " + getRadius()
                + ", Chiều cao: " + getHeight()
                + ", Màu: " + getColor()
                + ", Thể tích: " + getVolume();
    }
}