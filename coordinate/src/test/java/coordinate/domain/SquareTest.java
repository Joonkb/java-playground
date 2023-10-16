package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SquareTest {

    @Test
    @DisplayName("사각형의 넓이를 테스트한다.")
    void 사각형의_넓이() {
        Point p0 = new Point(10, 10);
        Point p1 = new Point(22, 10);
        Point p2 = new Point(22, 18);
        Point p3 = new Point(10, 18);

        Shape square = new Square(Arrays.asList(p0, p1, p2, p3));
        Assertions.assertThat(square.getArea()).isEqualTo(96, Offset.offset(0.00099));
    }

}
