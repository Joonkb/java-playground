package coordinate.domain;

import coordinate.utils.PointCalculator;

import java.util.List;

public class Triangle extends Shape {

    public Triangle(Points points) {
        super(points);
    }

    public Triangle(List<Point> pointList) {
        super(new Points(pointList));
    }

    @Override
    public Double calculateArea() {
        return PointCalculator.calculateArea(this);
    }
}