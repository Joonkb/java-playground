package coordinate.domain;

import coordinate.utils.PointCalculator;

import java.util.List;

public class Line extends Shape {

    public Line(Points points) {
        super(points);
    }

    public Line(List<Point> pointList) {
        super(new Points(pointList));
    }

    @Override
    public Double getArea() {
        return PointCalculator.getArea(this);
    }
}