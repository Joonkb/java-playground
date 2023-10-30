package coordinate.domain;

import java.util.List;

public abstract class Figure {
    List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

}