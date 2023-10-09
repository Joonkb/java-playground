package fuel.domain;

public class K5 extends Car{

    private static final String carModel = "K5";
    private static final int fuelEfficiency = 13;

    public K5(int dist) {
        super(dist);
    }

    @Override
    public double getDistancePerLiter() {
        return fuelEfficiency;
    }

    @Override
    public double getTripDistance() {
        return movingDistance;
    }

    @Override
    public String getName() {
        return carModel;
    }
}
