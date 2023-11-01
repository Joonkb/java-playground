package coordinate.factory;

import coordinate.domain.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FigureFactoryTest {

    @Test
    @DisplayName("팩토리에서 Line 인스턴스 반환 여부판단")
    void 선_반환_판단() {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 4);

        List<Point> points = Arrays.asList(p1, p2);
        Figure figure = FigureFactory.createFigure(points);
        assertThat(figure).isInstanceOf(Line.class);
    }

    @Test
    @DisplayName("팩토리에서 Triangle 인스턴스 반환 여부판단")
    void 삼각형_반환_판단() {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 4);
        Point p3 = new Point(2, 4);

        List<Point> points = Arrays.asList(p1, p2, p3);
        Figure figure = FigureFactory.createFigure(points);
        assertThat(figure).isInstanceOf(Triangle.class);
    }

    @Test
    @DisplayName("팩토리에서 Rectangle 인스턴스 반환 여부판단")
    void 사각형_반환_판단() {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 4);
        Point p3 = new Point(2, 4);
        Point p4 = new Point(2, 4);

        List<Point> points = Arrays.asList(p1, p2, p3, p4);
        Figure figure = FigureFactory.createFigure(points);
        assertThat(figure).isInstanceOf(Rectangle.class);
    }
}