package coordinate.utils;

import coordinate.domain.Point;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class ParsingUtilsTest {

    @Test
    @DisplayName("좌표 1개 추출")
    void 파싱_후_포인트_리스트_반환_01() {
        Point p = new Point(2, 3);
        List<Point> parsedList = ParsingUtils.parse("(2,3)");
        Assertions.assertThat(parsedList).containsOnly(p);
    }

    @Test
    @DisplayName("좌표 2개 추출")
    void 파싱_후_포인트_리스트_반환_02() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 3);
        List<Point> parsedList = ParsingUtils.parse("(2,3)-(4,3)");
        Assertions.assertThat(parsedList).containsOnly(p1, p2);
    }

    @Test
    @DisplayName("좌표 3개 추출")
    void 파싱_후_포인트_리스트_반환_03() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 3);
        Point p3 = new Point(5, 5);
        List<Point> parsedList = ParsingUtils.parse("(2,3)-(4,3)-(5,5)");
        Assertions.assertThat(parsedList).containsOnly(p1, p2, p3);
    }

    @Test
    @DisplayName("좌표 4개 추출")
    void 파싱_후_포인트_리스트_반환_04() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 3);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(6, 6);
        List<Point> parsedList = ParsingUtils.parse("(2,3)-(4,3)-(5,5)-(6,6)");
        Assertions.assertThat(parsedList).containsOnly(p1, p2, p3, p4);
    }
}