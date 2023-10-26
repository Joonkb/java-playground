package coordinate.domain;

import coordinate.utils.PointCalculator;

import java.util.List;

public class Square extends Shape {

    public Square(List<Point> pointList) {
        super(new Points(pointList));
    }

    @Override
    public Double calculateArea() {
        return PointCalculator.calculateArea(this);
    }
    @Override
    public String toString() {
        return String.format("사각형의 넓이는 %.0f", this.calculateArea());
    }
}
