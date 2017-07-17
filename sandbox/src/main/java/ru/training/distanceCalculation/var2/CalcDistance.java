package ru.training.distanceCalculation.var2;

/**
 * Created by ws03 on 7/17/2017.
 */
public class CalcDistance {

    public static void main(String[] args) {

        Point p1 = new Point();  // object p1 = new exemplar of Point class
        Point p2 = new Point(); // object p2 = new exemplar of Point class


        System.out.println("First operand is equivalent to " + p1.pX);
        System.out.println("Second operand is equivalent to " + p2.pY);
        System.out.println("Distance between A and B is equivalent to " + distance(p1, p2));


    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(p1.pX + p2.pY);
    }

}
