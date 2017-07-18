package ru.training.distanceCalculation.var1;

/**
 * Created by ws03 on 7/17/2017.
 * Class describes structure of a similar objects. Object=class Exemplar
 */

public class Point {


    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) + (p2.y - p1.y));
    }


}

