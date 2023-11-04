package coordinate.factory;

import coordinate.domain.Figure;
import coordinate.domain.Line;
import coordinate.domain.Point;

import java.util.List;

public class LineCreator implements FigureCreator {

    @Override
    public Figure create(List<Point> points) {
        return new Line(points);
    }
}
