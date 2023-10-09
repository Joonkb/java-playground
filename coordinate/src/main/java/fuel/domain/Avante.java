package fuel.domain;

public class Avante extends Car{

    private static final String carModel = "Avante";
    private static final int fuelEfficiency = 15;

    public Avante(int dist) {
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
