package coordinate.utils;

import coordinate.domain.Point;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParsingUtilsTest {

    @Test
    @DisplayName("좌표 하나를 파싱하는 기능")
    void 파싱_좌표_하나() {
        Point p = new Point(12, 23);
        List<Point> points = ParsingUtils.parse("(12,23)");
        assertThat(p).isEqualTo(points.get(0));
    }

    @Test
    @DisplayName("좌표 두개를 파싱하는 기능")
    void 파싱_좌표_두개() {
        Point p1 = new Point(12, 23);
        Point p2 = new Point(2, 11);
        List<Point> points = ParsingUtils.parse("(12,23)-(2,11)");
        assertThat(p1).isEqualTo(points.get(0));
        assertThat(p2).isEqualTo(points.get(1));
    }

}