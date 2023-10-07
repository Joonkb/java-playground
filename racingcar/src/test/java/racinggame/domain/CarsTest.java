package racinggame.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("우승자 List 반환 테스트 CASE : 단독우승")
    void 우승자_리스트_반환_테스트_단독() {

        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 5);
        Car car3 = new Car("car3", 6);
        List<Car> carList = Arrays.asList(car1, car2, car3);
        Cars cars = new Cars(carList);

        assertThat(cars.findWinners()).contains(car3);
    }

    @Test
    @DisplayName("우승자 List 반환 테스트 CASE : 공동우승")
    void 우승자_리스트_반환_테스트_공동() {

        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 5);
        Car car3 = new Car("car3", 6);
        Car car4 = new Car("car4", 6);
        List<Car> carList = Arrays.asList(car1, car2, car3, car4);
        Cars cars = new Cars(carList);

        assertThat(cars.findWinners()).contains(car3);
        assertThat(cars.findWinners()).contains(car4);
    }
}
