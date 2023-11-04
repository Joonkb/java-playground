package coordinate.domain;

import coordinate.utils.PointCalculator;

import java.util.List;

public class Line extends Figure {
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public Double calculateArea() {
        return PointCalculator.calculateArea(this);
    }

    @Override
    public String toString() {
        return String.format("두 점 사이 거리는 %f", this.calculateArea());
    }
}
