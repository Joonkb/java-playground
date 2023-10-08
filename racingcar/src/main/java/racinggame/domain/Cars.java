package racinggame.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    // 우승자 이름의 나열을 문자열의 형태로 반환한다.
    public List<Car> findWinners() {
        int maxPosition = this.getMaxPositionValue();
        return cars.stream()
                .filter(c -> c.getPosition().getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    private int getMaxPositionValue() {
        return cars.stream()
                .map(c -> c.getPosition().getPosition())
                .max(Integer::compareTo).get();
    }

    public void getCarsStatus() {
        for (Car car : cars) {
            System.out.println(car.getDescription());
        }
        System.out.println();
    }

    public void move() {
        for (Car car : cars) {
            car.move(new RandomMovingStrategy());
        }
    }
}
