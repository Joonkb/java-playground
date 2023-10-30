package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FigureTypeTest {

    @Test
    @DisplayName("도형Enum을 반환한다. 선")
    void 포인트수에_따른_ENUM_선_반환() {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 4);

        List<Point> pointList = Arrays.asList(p1, p2);
        FigureType figureType = FigureType.getType(pointList);

        Assertions.assertThat(figureType).isEqualTo(FigureType.LINE);
        Assertions.assertThat(figureType).isNotEqualTo(FigureType.RECTANGLE);
        Assertions.assertThat(figureType).isNotEqualTo(FigureType.TRIANGLE);
    }

    @Test
    @DisplayName("도형Enum을 반환한다. 삼각형")
    void 포인트수에_따른_ENUM_삼각형_반환() {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(4, 5);

        List<Point> pointList = Arrays.asList(p1, p2, p3);
        FigureType figureType = FigureType.getType(pointList);

        Assertions.assertThat(figureType).isEqualTo(FigureType.TRIANGLE);
        Assertions.assertThat(figureType).isNotEqualTo(FigureType.RECTANGLE);
        Assertions.assertThat(figureType).isNotEqualTo(FigureType.LINE);
    }

    @Test
    @DisplayName("도형Enum을 반환한다. 사각형")
    void 포인트수에_따른_ENUM_사각형_반환() {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(4, 2);
        Point p4 = new Point(5, 4);

        List<Point> pointList = Arrays.asList(p1, p2, p3, p4);
        FigureType figureType = FigureType.getType(pointList);

        Assertions.assertThat(figureType).isEqualTo(FigureType.RECTANGLE);
        Assertions.assertThat(figureType).isNotEqualTo(FigureType.TRIANGLE);
        Assertions.assertThat(figureType).isNotEqualTo(FigureType.LINE);
    }
}