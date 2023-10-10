package fuel;

import fuel.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany implements ReportManager {

    private static final String NEWLINE = System.getProperty("line.separator");
    private List<Car> carList = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    /**
     * ReportManager 인터페이스를 구현 
     */
    @Override
    public String generateReport() {
        StringBuilder content = new StringBuilder();
        for (Car car : carList) {
            content.append(car).append(NEWLINE);
        }
        return content.toString();
    }
}
