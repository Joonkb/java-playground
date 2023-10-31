package coordinate.factory;

import coordinate.domain.Figure;
import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Triangle;

import java.util.List;

public class TriangleCreator implements FigureCreator {
    @Override
    public Figure create(List<Point> points) {
        return new Triangle(points);

    }
}
