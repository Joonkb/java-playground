package racingcar.race;

import lombok.Getter;
import java.util.List;
import java.util.stream.Collectors;

import static racingcar.utils.ValidationUtils.*;

@Getter
public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        validateCarNameLength(cars);
        validateNoneDuplicate(cars);
        this.cars = cars;
    }

    // 우승자 이름의 나열을 문자열의 형태로 반환한다.
    public String getWinnerNames() {
        int maxValue = this.getMaxPositionValue();
        return cars.stream()
                .filter(c -> c.getPosition() == maxValue)
                .map(Car::getCarName)
                .collect(Collectors.joining(", "));
    }

    // 자동차들 중에서 가장 멀리간 자동차의 Position 반환한다.
    public int getMaxPositionValue() {
        return cars.stream()
                .map(Car::getPosition)
                .max(Integer::compareTo).get();
    }

    public void getCarsStatus() {
        for (Car car : cars) {
            System.out.println(car.getDescription());
        }
        System.out.println();
    }

    public void randomMove() {
        for (Car car : cars) {
            car.randomMove();
        }
    }
}