package coordinate.domain;

import java.util.List;

public enum FigureType {
    LINE(2),
    TRIANGLE(3),
    RECTANGLE(4);

    private int numberOfPoint;

    FigureType(int numberOfPoint) {
        this.numberOfPoint = numberOfPoint;
    }

    public int getNumberOfPoint() {
        return numberOfPoint;
    }

    public static FigureType getType(List<Point> pointList) {
        if (pointList.size() == 2) {
            return LINE;
        }
        if (pointList.size() == 3) {
            return TRIANGLE;
        }
        if (pointList.size() == 4) {
            return RECTANGLE;
        }
        throw new IllegalArgumentException("정의되지 않은 도형입니다.");
    }
}