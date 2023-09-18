package racingcar.race;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    void CarForwardTest() {
        Car car1 = new Car("car1");
        car1.moveForward();
        assertEquals(car1.getPosition(), 2);
    }
}
