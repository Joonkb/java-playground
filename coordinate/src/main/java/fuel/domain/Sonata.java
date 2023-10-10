package fuel.domain;

import static fuel.domain.CarModel.SONATA;

public class Sonata extends Car {

    private static final CarModel carModel = CarModel.SONATA;

    public Sonata(int dist) {
        super(dist);
    }

    @Override
    public double getDistancePerLiter() {
        return carModel.getFuelEfficiency();
    }

    @Override
    public double getTripDistance() {
        return movingDistance;
    }

    @Override
    public String getName() {
        return carModel.getModelName();
    }
}
