package coordinate.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {

    @Test
    @DisplayName("X, Y 좌표의 범위 값을 검증한다. 음수 CASE")
    void X좌표_음수_에러발생(){
        assertThatThrownBy(() -> new Point(-4, 21))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("X, Y 좌표의 범위 값을 검증한다. 24초과 CASE")
    void Y좌표_24_초과_에러발생(){
        assertThatThrownBy(() -> new Point(3, 26))
                .isInstanceOf(IllegalArgumentException.class);
    }

}