package racingcar.race;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    @DisplayName("현재 위치정보를 기반으로 우승자를 출력한다.")
    void whoWinnerNames_우승자_2명() {
        Cars cars = new Cars();
        cars.add(new Car("lsh", 4));
        cars.add(new Car("kbj", 4));
        Assertions.assertThat(cars.getWinnerNames()).isEqualTo("lsh, kbj");
    }

    @Test
    @DisplayName("현재 위치정보를 기반으로 우승자를 출력한다.")
    void whoWinnerNames_우승자_1명() {
        Cars cars = new Cars();
        cars.add(new Car("lsh", 3));
        cars.add(new Car("kbj", 4));
        Assertions.assertThat(cars.getWinnerNames()).isEqualTo("kbj");
    }

    @Test
    @DisplayName("현재 위치정보를 기반으로 가장 멀리간 자동차의 위치를 출력.")
    void getMaxPositionValue() {
        Cars cars = new Cars();
        cars.add(new Car("lsh", 4));
        cars.add(new Car("lsh", 4));
        cars.add(new Car("lky", 6));
        cars.add(new Car("shin", 7));
        Assertions.assertThat(cars.getMaxPositionValue()).isEqualTo(7);
    }
}