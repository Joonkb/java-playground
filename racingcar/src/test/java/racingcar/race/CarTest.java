package racingcar.race;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    @DisplayName("앞으로 전진하는 기능을 구현 1 -> 2로 제대로 전진했는지 판단")
    void CarForwardTest() {
        Car car1 = new Car("car1");
        car1.moveForward();
        assertEquals(car1.getPosition(), 2);
    }

    @Test
    @DisplayName("자동차의 현재 상태를 문자열로 반환하는 기능을 구현")
    void getCarStatus() {
        Car car2 = new Car("car2");
        car2.moveForward();
        car2.moveForward();
        assertEquals(car2.getDescription(), "car2 : ---");
    }

}
