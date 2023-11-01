package coordinate.domain;

import coordinate.utils.PointCalculator;

import java.util.List;

public abstract class Figure {
    List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public abstract Double calculateArea();
}