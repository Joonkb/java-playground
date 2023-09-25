package racingcar.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.race.Car;
import racingcar.race.Cars;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidationUtilsTest {

    @Test
    @DisplayName("자동차 이름은 5자를 초과할 수 없음_5글자_초과")
    void validateCarName_5자_초과() {

        // Cars 객체를 위한 자동차 List를 만든다.
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BJKing", 4));
        carList.add(new Car("kbj", 4));

        // 예외 메시지로 검증하기 ####################################################
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cars(carList);
        });
        Assertions.assertThat("자동차 이름은 5자를 초과할 수 없습니다.").isEqualTo(exception.getMessage());
    }

    @Test
    @DisplayName("자동차 이름은 중복될 수 없습니다.")
    void validateCarName_5자_이하() {

        // Cars 객체를 위한 자동차 List를 만든다.
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("kbj", 4));
        carList.add(new Car("kbj", 4));

        // 예외 메시지로 검증하기 ####################################################
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cars(carList);
        });
        Assertions.assertThat("자동차 이름은 중복될 수 없습니다.").isEqualTo(exception.getMessage());
    }
}
