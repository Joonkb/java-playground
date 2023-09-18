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

    public String getDescription() {
        StringBuilder description = new StringBuilder(carName);
        description.append(" : ");
        for (int cnt = 1; cnt <= position; ++cnt) {
            description.append("-");
        }
        return description.toString();
    }
}
