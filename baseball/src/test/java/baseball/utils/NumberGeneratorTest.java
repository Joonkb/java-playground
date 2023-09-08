package baseball.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberGeneratorTest {

    @Test
    @DisplayName("숫자 3개를 만들어 내는지 확인한다.")
    void RandomNumber_3_Test() {
        List<Integer> numberList = NumberGenerator.createRandomNumber();
        assertThat(numberList.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("반환된 숫자들이 유효한 숫자인지 체크한다.")
    void ValidationUtilsTest() {
        List<Integer> numberList = NumberGenerator.createRandomNumber();
        assertThat(ValidationUtils.isValidNumber(numberList.get(0))).isTrue();
        assertThat(ValidationUtils.isValidNumber(numberList.get(1))).isTrue();
        assertThat(ValidationUtils.isValidNumber(numberList.get(2))).isTrue();
    }
}
