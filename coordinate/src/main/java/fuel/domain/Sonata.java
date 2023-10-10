package fuel.domain;

import static fuel.domain.CarModel.SONATA;

public class Sonata extends Car {

    private static final CarModel carModel = CarModel.SONATA;

    public Sonata(int dist) {
        super(dist, SONATA);
    }
}
