package fuel.domain;

import static fuel.domain.CarModel.AVANTE;

public class Avante extends Car{

    private static final CarModel carModel = AVANTE;

    public Avante(int dist) {
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
