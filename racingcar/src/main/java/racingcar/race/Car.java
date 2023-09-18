package racingcar.race;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private String carName;
    private int position;

    public Car(String carName) {
        this.carName = carName;
        position = 1;
    }

    public void moveForward() {
        this.position += 1;
    }

}
