package racingcar.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @Test
    @DisplayName("자동차 이름은 5자를 초과할 수 없음_5글자_초과")
    void validateCarName_5자_초과() {
        String carName = "BJKing";
        boolean exceed5CharYn = ValidationUtils.validateCarName(carName);
        Assertions.assertThat(exceed5CharYn).isFalse();
    }

    @Test
    @DisplayName("자동차 이름은 5자를 초과할 수 없음_5글자_이하")
    void validateCarName_5자_이하() {
        String carName = "BJKim";
        boolean exceed5CharYn = ValidationUtils.validateCarName(carName);
        Assertions.assertThat(exceed5CharYn).isTrue();
    }
}
