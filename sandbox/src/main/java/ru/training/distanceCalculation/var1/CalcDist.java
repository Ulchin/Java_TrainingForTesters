package ru.training.distanceCalculation.var1;


import static ru.training.distanceCalculation.var1.Point.distance;

/**
 * Created by ws03 on 7/17/2017.
 */
public class CalcDist {


    public static void main(String[] args) {

        Point p1 = new Point(2, 4); // Point1 X;Y coordinates can be changed here
        Point p2 = new Point(5, 6); // Point2 X;Y coordinates can be changed here
        dist(p1, p2);
    }


    public static void dist(Point p1, Point p2) {
        System.out.println("The distance between point A and point B equal to " + distance(p1, p2));

    }


}

