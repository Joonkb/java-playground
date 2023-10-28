package coordinate.utils;

import coordinate.domain.Point;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class ParsingUtilsTest {

    @Test
    @DisplayName("")
    void 파싱_후_포인트_반환() {
        Point p = new Point(2, 3);
        List<Point> parsedList = ParsingUtils.parse("(2,3)");
        Assertions.assertThat(parsedList).containsOnly(p);
    }
}