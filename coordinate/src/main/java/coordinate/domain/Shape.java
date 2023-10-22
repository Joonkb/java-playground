package coordinate.domain;

import java.util.List;

public abstract class Shape {

    protected Points points; // 일급컬렉션
    protected ShapeEnum type;

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
        if (pointCnt == 2) {
            return ShapeEnum.LINE;
        }
        if (pointCnt == 3) {
            return ShapeEnum.TRIANGLE;
        }
        return ShapeEnum.SQUARE;
    }

    public abstract Double calculateArea();
}
