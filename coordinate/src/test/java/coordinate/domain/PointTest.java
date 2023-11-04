package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    @DisplayName("두 점이 같은지 판단한다.")
    void 포인트_객체_같은지() {
        Point p1 = new Point(3, 1);
        Point p2 = new Point(3, 1);
        Assertions.assertThat(p1).isEqualTo(p2);
    }

    @Test
    @DisplayName("두 점이 다른지 판단한다.")
    void 포인트_객체_다른지() {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(3, 1);
        Assertions.assertThat(p1).isNotEqualTo(p2);
    }
}