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
        // TODO: 익명클래스로 구현하면, 구상클래스(Line, Triangle, ..) 안만들어도 될 것 같음
        figureMap.put(LINE, new LineCreator());
        figureMap.put(TRIANGLE, new TriangleCreator());
        figureMap.put(RECTANGLE, new RectangleCreator());
    }

    public static Figure createFigure(List<Point> points) {
        FigureType figureType = FigureType.getType(points);
        return figureMap.get(figureType).create(points);
    }
}
