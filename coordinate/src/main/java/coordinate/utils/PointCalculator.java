package coordinate.utils;

import coordinate.domain.Line;
import coordinate.domain.Point;

import java.util.List;

public class PointCalculator {
    public static double getArea(Line line) {
        List<Point> pointList = line.getPoints().getPoints();
        Point p1 = pointList.get(0);
        Point p2 = pointList.get(1);
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}
