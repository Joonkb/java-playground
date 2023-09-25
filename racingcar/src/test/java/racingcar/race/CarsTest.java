package racingcar.race;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CarsTest {

    @Test
    @DisplayName("현재 위치정보를 기반으로 우승자를 출력한다.")
    void whoWinnerNames_우승자_2명() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("lsh", 4));
        carList.add(new Car("kbj", 4));

        Cars cars = new Cars(carList);
        Assertions.assertThat(cars.getWinnerNames()).isEqualTo("lsh, kbj");
    }

    @Test
    @DisplayName("현재 위치정보를 기반으로 우승자를 출력한다.")
    void whoWinnerNames_우승자_1명() {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("lsh", 3));
        carList.add(new Car("kbj", 4));

        Cars cars = new Cars(carList);
        Assertions.assertThat(cars.getWinnerNames()).isEqualTo("kbj");
    }

    @Test
    @DisplayName("현재 위치정보를 기반으로 가장 멀리간 자동차의 위치를 출력.")
    void getMaxPositionValue() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("kbj", 9));
        carList.add(new Car("lsh", 5));
        carList.add(new Car("lky", 6));
        carList.add(new Car("shin", 7));

        Cars cars = new Cars(carList);
        Assertions.assertThat(cars.getMaxPositionValue()).isEqualTo(9);
    }
}