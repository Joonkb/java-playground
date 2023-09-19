package racingcar.race;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private List<Car> cars;

    public Cars() {
        cars = new ArrayList<>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    // 우승자 이름의 나열을 문자열의 형태로 반환한다.
    public String getWinnerNames() {
        StringBuilder winners = new StringBuilder();
        int maxValue = this.getMaxPositionValue();

        return cars.stream()
                .filter(c -> c.getPosition() == maxValue)
                .map(c -> c.getCarName())
                .collect(Collectors.joining(", "));
    }

    // 자동차들중에서 가장 멀리간 자동차의 Position 반환한다.
    public int getMaxPositionValue() {
        return cars.stream()
                .map(c -> c.getPosition())
                .max(Integer::compareTo).get();
    }
}
