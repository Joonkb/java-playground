package coordinate.domain;

import java.util.List;

public abstract class Shape {

    public static final int TWO_POINTS   = 2;
    public static final int THREE_POINTS = 3;

    protected ShapeEnum type;

    protected Points points; // 일급컬렉션

    public Shape(Points points) {
        type = getTypeByPoints(points);
        this.points = points;
    }

    public Points getPoints() {
        return this.points;
    }

    public List<Point> getPointList() {
        return points.getPoints();
    }

    public ShapeEnum getType() {
        return type;
    }

    private ShapeEnum getTypeByPoints(Points points) {
        int pointCnt = points.getPoints().size();
        if (pointCnt == TWO_POINTS) {
            return ShapeEnum.LINE;
        }
        if (pointCnt == THREE_POINTS) {
            return ShapeEnum.TRIANGLE;
        }
        return ShapeEnum.SQUARE;
    }

    public abstract Double calculateArea();
}
