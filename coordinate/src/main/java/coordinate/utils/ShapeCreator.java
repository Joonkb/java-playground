package coordinate.utils;

import coordinate.domain.*;

import java.util.List;

public class ShapeCreator {

    public static final int TWO_POINTS   = 2;
    public static final int THREE_POINTS = 3;

    public static Shape createShape(List<Point> pointList) {
        ShapeEnum type = getShapeType(pointList);
        if (ShapeEnum.LINE == type) {
            return new Line(pointList);
        }
        if (ShapeEnum.SQUARE == type) {
            return new Square(pointList);
        }
        return new Triangle(pointList);
    }

    // List<Point>를 이용하여 ShapeEnum을 반환
    private static ShapeEnum getShapeType(List<Point> pointList) {
        int pointCnt = pointList.size();
        if (pointCnt == TWO_POINTS) {
            return ShapeEnum.LINE;
        }
        if (pointCnt == THREE_POINTS) {
            return ShapeEnum.TRIANGLE;
        }
        return ShapeEnum.SQUARE;
    }
}
