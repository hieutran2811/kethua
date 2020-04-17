package PointandMoveableClass;

import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(5,5,2.5f,3.6f);
        System.out.println(Arrays.toString(p1.move()));
    }
}
