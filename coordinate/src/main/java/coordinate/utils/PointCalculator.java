package coordinate.utils;

import coordinate.domain.*;

import java.util.List;

public class PointCalculator {
    public static double getArea(Line line) {
        List<Point> pointList =line.getPointList();
        Point p1 = pointList.get(0);
        Point p2 = pointList.get(1);

        // 선의 길이 반환
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
    public static double getArea(Square square) {
        List<Point> pointList = square.getPoints().getPoints();
        Point p0 = pointList.get(0);
        Point p1 = pointList.get(1);
        Point p2 = pointList.get(2);
        Point p3 = pointList.get(3);
        
        // 사격형 넓이 반환
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
    public static double getArea(Triangle line) {
        List<Point> pointList = line.getPoints().getPoints();
        Point p0 = pointList.get(0);
        Point p1 = pointList.get(1);
        Point p2 = pointList.get(2);
        
        // 삼각형 넓이 반환
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}