package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LineTest {

    @Test
    @DisplayName("두 점 사이의 거리를 테스트한다.")
    void 두점사이_거리() {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(14, 15);
        Line line = new Line(Arrays.asList(p1, p2));
        Assertions.assertThat(line.getArea()).isEqualTo(6.403, Offset.offset(0.00099));
    }
}