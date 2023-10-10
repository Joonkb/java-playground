package fuel.domain;

public enum CarModel {

    AVANTE("Avante", 15),
    SONATA("Sonata", 10),
    K5("K5", 13);

    private final String modelName;
    private final double fuelEfficiency;

    CarModel(String name, int fuelEfficiency) {
        this.modelName = name;
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public String getModelName() {
        return modelName;
    }
}
