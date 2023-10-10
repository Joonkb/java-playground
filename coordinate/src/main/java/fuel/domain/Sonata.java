package fuel.domain;

public class Sonata extends Car {

    private static final String carModel = "Sonata";
    private static final int fuelEfficiency = 10;

    public Sonata(int dist) {
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
