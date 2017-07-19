package ru.training.distanceCalculation.var3;

/**
 * Created by ws03 on 7/17/2017.
 */
public class CalcDistance {

    public static void main(String[] args) {

        dist(1, 3, 5, 7);
        dist(3, 5, 12, 34);
        dist(4, 6, 8, 9);

    }

    public static void dist(double xf, double yf, double xs, double ys) {
        System.out.println("Distance between A and B is equial to " + Point.distance(xf, yf, xs, ys));
    }
}
