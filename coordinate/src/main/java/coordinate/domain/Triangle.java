package coordinate.domain;

import java.util.List;

public class Triangle extends Shape {

    public Triangle(Points points) {
        super(points);
    }

    public Triangle(List<Point> pointList) {
        super(new Points(pointList));
    }

    @Override
    public Double getArea() {
        return null;
    }
}