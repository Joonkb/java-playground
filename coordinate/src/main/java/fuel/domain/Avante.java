package fuel.domain;

import static fuel.domain.CarModel.AVANTE;

public class Avante extends Car{

    private static final CarModel carModel = AVANTE;

    public Avante(int dist) {
        super(dist, AVANTE);
    }
}
