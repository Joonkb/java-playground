package racingcar.race;

import racingcar.utils.StringUtils;
import view.UserView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static view.UserView.*;

public class RaceBoard {

    private static Cars cars = new Cars();
    private static Random random = new Random(10);
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
        moveForward(repeatCount);

        // 4. 우승자의 이름을 나열한다.
        getClosingDesc(cars.getWinnerNames());
    }

    // TODO : depth = 1 로 맞출것.
    private static void moveForward(int repeatCount) {
        List<Car> carList = cars.getCars();
        for (int cnt = 1; cnt <= repeatCount; ++cnt) {
            for (Car car : carList) {
                if (random.nextInt() >= 4) {
                    car.moveForward();
                }
            }
            cars.getCarsStatus();
        }
    }

    private static void createCars(String input) {
        String[] names = StringUtils.splitByComma(input);
        for (String name : names) {
            cars.add(new Car(name));
        }
    }


    public static void main(String[] args) {
        play();
    }
}
