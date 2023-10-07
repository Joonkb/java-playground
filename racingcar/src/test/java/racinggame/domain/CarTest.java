package racinggame.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차가 한칸 움직였는지 확인")
    void 이동() {
        Car car = new Car("KBJ", 1);
        car.move(() -> true);
        Assertions.assertThat(car.getPosition()).isEqualTo(new Position(2));
    }

    @Test
    @DisplayName("자동차가 제자리에 머물렀는지 확인")
    void 정지() {
        Car car = new Car("KBJ", 1);
        car.move(() -> false);
        Assertions.assertThat(car.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    @DisplayName("자동차의 현재 위치를 문자열로 표현")
    void 자동차_현재_위치상태_반환() {
        Car car = new Car("KBJ", 3);
        car.move(() -> true);
        Assertions.assertThat(car.getDescription()).isEqualTo("KBJ : ----");
    }

}
