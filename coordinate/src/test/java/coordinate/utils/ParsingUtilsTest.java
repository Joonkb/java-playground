package coordinate.utils;

import coordinate.domain.Point;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParsingUtilsTest {

    @Test
    @DisplayName("좌표 하나를 파싱하는 기능")
    void 파싱_좌표하나() {
        Point p = new Point(12, 23);
        Point parsed = ParsingUtils.parse("(12,23)");
        Assertions.assertThat(p).isEqualTo(parsed);
    }
}