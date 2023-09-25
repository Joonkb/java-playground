package racingcar.race;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Car {

    private static final int FLAG = 4;
    private String carName;
    private int position;

    public Car(String carName) {
        this.carName = carName;
        position = 1;
    }

    public Car(String carName, int position) {
        this.carName = carName;
        this.position = position;
    }

    public void moveForward() {
        this.position += 1;
    }

    public void randomMove() {
        Random random = new Random();
        int randInt = random.nextInt(10);
        if(randInt >= FLAG) {
            this.moveForward();
        }
    }

    // 현재 위치정보를 기반으로 자동차이름과 : "-" 를 출력한다.
    public String getDescription() {
        StringBuilder description = new StringBuilder(carName);
        description.append(" : ");
        for (int cnt = 1; cnt <= position; ++cnt) {
            description.append("-");
        }
        return description.toString();
    }
}