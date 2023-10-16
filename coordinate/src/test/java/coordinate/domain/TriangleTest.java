package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    @DisplayName("삼각형의 넓이를 테스트한다.")
    void 삼각형의_넓이() {
        Point p0 = new Point(10, 10);
        Point p1 = new Point(14, 15);
        Point p2 = new Point(20, 8);

        Shape triangle = new Triangle(Arrays.asList(p0, p1, p2));
        assertThat(triangle.getArea()).isEqualTo(29.0, Offset.offset(0.00099));
    }
}
