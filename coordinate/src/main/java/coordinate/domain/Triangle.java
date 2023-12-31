package coordinate.domain;

import coordinate.utils.PointCalculator;

import java.util.List;

public class Triangle extends Figure {
    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public Double calculateArea() {
        return PointCalculator.calculateArea(this);
    }

    @Override
    public String toString() {
        return String.format("삼각형의 넓이는 %.1f",  this.calculateArea());
    }
}
