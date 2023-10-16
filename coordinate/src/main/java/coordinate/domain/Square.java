package coordinate.domain;

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
        return null;
    }
}
