package coordinate.domain;

import coordinate.utils.PointCalculator;

import java.util.List;

public class Square extends Shape {

    public Square(Points points) {
        super(points);
    }

    public Square(List<Point> pointList) {
        super(new Points(pointList));
    }

    @Override
    public Double getArea() {
        return PointCalculator.getArea(this);
    }
}
