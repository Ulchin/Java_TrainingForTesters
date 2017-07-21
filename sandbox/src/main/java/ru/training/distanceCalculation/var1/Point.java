package ru.training.distanceCalculation.var1;

/**
 * Created by ws03 on 7/17/2017.
 * Class describes structure of a similar objects. Object=class Exemplar
 */

public class Point {

    public double x; //creation of attributes
    public double y;

    public Point(double x, double y) { //initializing attributes with constructor params
        this.x=x;
        this.y=y;

    }

   public double distance(Point p2){    // attributes usage. p2 - object that defines point2 coordinates
       return Math.sqrt(((p2.x - this.x) * (p2.x - this.x)) + ((p2.y - this.y) * (p2.y - this.y)));
   }


}

