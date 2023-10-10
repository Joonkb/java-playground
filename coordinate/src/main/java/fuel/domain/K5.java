package fuel.domain;


public class K5 extends Car{

    private static final CarModel carModel = CarModel.K5;

    public K5(int dist) {
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