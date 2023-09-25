package racingcar.utils;

import racingcar.race.Car;

import java.util.List;

public class ValidationUtils {

    private static final int MAX_LENGTH  = 5;

    // 자동차의 이름중 5자리가 초과하는 이름이 존재하면 예외를 던진다.
    public static void validateCarNameLength(List<Car> cars) {
        for (Car car : cars) {
            validateCarName(car);
        }
    }

    private static void validateCarName(Car car) {
        String msg = "자동차 이름은 5자를 초과할 수 없습니다.";
        if (car.getCarName().length() > MAX_LENGTH) {
            throw new IllegalArgumentException(msg);
        }
    }

    // 자동차의 이름중 중복된 이름이 존재하면 예외를 던진다.
    public static void validateNoneDuplicate(List<Car> cars) {
        String msg = "자동차 이름은 중복될 수 없습니다.";
        if(cars.size() != cars.stream().map(car -> car.getCarName()).distinct().count()){
            throw new IllegalArgumentException(msg);
        }
    }
}
