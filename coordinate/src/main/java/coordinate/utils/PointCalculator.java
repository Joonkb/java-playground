package coordinate.utils;

import coordinate.domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointCalculator {

    /**
     * 선의 길이를 반환한다.
     */
    public static double calculateArea(Line line) {
        List<Point> pointList =line.getPointList();
        Point p1 = pointList.get(0);
        Point p2 = pointList.get(1);
        
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    /**
     * 사각형의 넓이를 반환한다.
     */
    public static double calculateArea(Square square) {

        List<Point> pointList = square.getPoints().getPoints();
        int maxX = pointList.stream().map(Point::getX).max(Integer::compareTo).get();
        int minX = pointList.stream().map(Point::getX).min(Integer::compareTo).get();
        int maxY = pointList.stream().map(Point::getY).max(Integer::compareTo).get();
        int minY = pointList.stream().map(Point::getY).min(Integer::compareTo).get();
        
        return (maxX - minX) * (maxY - minY);
    }

    /**
     * 삼각형의 넓이를 반환한다.
     */
    public static double calculateArea(Triangle line) {

        List<Point> pointList = line.getPoints().getPoints();
        Point p0 = pointList.get(0);
        Point p1 = pointList.get(1);
        Point p2 = pointList.get(2);

        Shape l0 = new Line(Arrays.asList(p0, p1));
        Shape l1 = new Line(Arrays.asList(p1, p2));
        Shape l2 = new Line(Arrays.asList(p2, p0));

        double a = l0.calculateArea();
        double b = l1.calculateArea();
        double c = l2.calculateArea();

        double s = (a + b + c) / 2;
        
        // 삼각형 넓이 반환
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}