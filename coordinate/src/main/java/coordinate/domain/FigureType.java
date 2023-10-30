package coordinate.domain;

import java.util.List;

public enum FigureType {

    LINE,
    TRIANGLE,
    RECTANGLE;

    public FigureType getType(List<Point> pointList) {
        if (pointList.size() == 2) {
            return FigureType.LINE;
        }
        if (pointList.size() == 3) {
            return TRIANGLE;
        }
        if (pointList.size() == 4) {
            return RECTANGLE;
        }
        throw new IllegalArgumentException("사용할 수 없는 도형입니다.");
    }

}