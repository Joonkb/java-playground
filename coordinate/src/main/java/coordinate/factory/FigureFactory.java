package coordinate.factory;

import coordinate.domain.Figure;
import coordinate.domain.FigureType;
import coordinate.domain.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {

    private static Map<FigureType, FigureCreator> figureMap = new HashMap<>();
    static {
        figureMap.put(FigureType.LINE, new LineCreator());
        figureMap.put(FigureType.TRIANGLE, new LineCreator());
        figureMap.put(FigureType.RECTANGLE, new LineCreator());
    }

    public Figure createFigure(List<Point> points) {
        FigureType figureType = FigureType.getType(points);
        return figureMap.get(figureMap).create(points);
    }
}
