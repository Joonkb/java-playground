package coordinate.factory;

import coordinate.domain.Figure;
import coordinate.domain.FigureType;
import coordinate.domain.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static coordinate.domain.FigureType.*;

public class FigureFactory {

    private static Map<FigureType, FigureCreator> figureMap = new HashMap<>();
    static {
        figureMap.put(LINE, new LineCreator());
        figureMap.put(TRIANGLE, new TriangleCreator());
        figureMap.put(RECTANGLE, new RectangleCreator());
    }

    public static Figure createFigure(List<Point> points) {
        FigureType figureType = FigureType.getType(points);
        return figureMap.get(figureType).create(points);
    }
}
