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
        Point p1 = new Point(6,7);
        Point p2 = new Point(12,9);
        Assert.assertEquals(p1.distance(p2), 6.324555320336759);
    }

    @Test(priority = 1)
    public void DistCalc2() {
        Point p1 = new Point(43,7);
        Point p2 = new Point(67,11);
        Assert.assertEquals(p1.distance(p2), 24.331050121192877);
    }

    @Test(priority = 2)
    public void DistCalc3() {
        Point p1 = new Point(1,1);
        Point p2 = new Point(12,9);
        Assert.assertEquals(p1.distance(p2), 13.601470508735444);

    }
}
