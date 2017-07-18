package ru.training.distanceCalculation;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.training.distanceCalculation.var1.Point;

/**
 * Created by ws03 on 7/18/2017.
 */
public class PointTests {

    @Test(priority = 0)
    public void DistCalc1() {
        Point p = new Point(0, 0);
        Point fir = new Point(2, 4);
        Point sec = new Point(6, 9);

        Assert.assertEquals(p.distance(fir, sec), 3.0);
    }

    @Test(priority = 1)
    public void DistCalc2() {
        Point p = new Point(0, 0);
        Point fir = new Point(7, 14);
        Point sec = new Point(12, 17);

        Assert.assertEquals(p.distance(fir, sec), 2.8284271247461903);
    }

    @Test(priority = 2)
    public void DistCalc3() {
        Point p = new Point(0, 0);
        Point fir = new Point(17, 14);
        Point sec = new Point(23, 40);

        Assert.assertEquals(p.distance(fir, sec), 5.656854249492381);

    }
}
