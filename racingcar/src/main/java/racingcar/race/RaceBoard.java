package racingcar.race;

import racingcar.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static view.UserView.*;

public class RaceBoard {

    private static Cars cars;
    private static Scanner sc = new Scanner(System.in);

    private static void play() {

        // 1. 자동차 이름을 입력받는다.
        description();
        String input = sc.next();
        createCars(input);

        // 2. 몇 회를 반복할지 입력받는다.
        userInputDesc();
        int repeatCount = sc.nextInt();

        // 3. 반복 횟수만큼 자동차를 전진시킨다.
        resultDesc();
        racing(repeatCount);

        // 4. 우승자의 이름을 나열한다.
        getClosingDesc(cars.getWinnerNames());
    }

    private static void racing(int repeatCount) {
        for (int count = 1; count <= repeatCount; ++count) {
            moveForward();
            cars.getCarsStatus();
        }
    }

    private static void moveForward() {
        cars.randomMove();
    }

    private static void createCars(String input) {
        String[] names = StringUtils.splitByComma(input);
        List<Car> carList = new ArrayList<>();
        for (String name : names) {
            carList.add(new Car(name));
        }
        cars = new Cars(carList);
    }

    public static void main(String[] args) {
        play();
    }
}