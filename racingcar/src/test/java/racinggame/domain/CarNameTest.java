package racinggame.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNameTest {

    @Test
    @DisplayName("자동차이름_5글자_초과")
    void 자동차이름_5글자_초과() {
        Assertions.assertThatThrownBy(() -> new Car("byeongjoon"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차이름_공백_혹은_null")
    void 자동차이름_공백_혹은_null() {
        Assertions.assertThatThrownBy(() -> new Car(""))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
