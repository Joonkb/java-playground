package coordinate.factory;

import coordinate.domain.Figure;
import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Rectangle;

import java.util.List;

public class RectangleCreator implements FigureCreator {
    @Override
    public Figure create(List<Point> points) {
        return new Rectangle(points);

    }
}
