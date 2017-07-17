package ru.training.distanceCalculation.var2;

/**
 * Created by ws03 on 7/17/2017.
 * Class describes structure of a similar objects. Object=class Exemplar
 */

public class Point {

    public double pX = firstOperand(2, 4); //attribute
    public double pY = secondOperand(1, 4); //attribute

    public Point() {
    }

    public double firstOperand(double x1, double x2) {
        return x2 - x1;
    }

    public double secondOperand(double y1, double y2) {

        return y2 - y1;
    }

}

