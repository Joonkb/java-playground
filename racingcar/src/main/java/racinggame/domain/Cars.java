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
//        Position maxPosition = this.getMaxPosition();
        return cars.stream()
//                .filter(c -> c.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    // 자동차들 중에서 가장 멀리간 자동차의 Position 반환한다.
    // Position 객체를 반환하도록 구현 TODO: 수정
    private Position getMaxPositionValue() {
        return cars.stream()
                .max(Position::getPosition)
    }

    public void getCarsStatus() {
        for (Car car : cars) {
            System.out.println(car.getDescription());
        }
        System.out.println();
    }

    public void move() {
        for (Car car : cars) {
            car.move(new MovingStrategyImpl());
        }
    }
}
