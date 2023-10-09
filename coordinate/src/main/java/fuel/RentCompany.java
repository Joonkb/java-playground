package fuel;

import fuel.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany extends CarRentFactory{

    private static final String NEWLINE = System.getProperty("line.separator");
    private List<Car> carList = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        carList.add(car);
    }


    public String generateReport() {
        StringBuilder content = new StringBuilder();
        for (Car car : carList) {
            content.append(car.getName()+ " : ")
                    .append((int)car.getChargeQuantity())
                    .append("리터")
                    .append(NEWLINE);
        }
        return content.toString();
    }
}
