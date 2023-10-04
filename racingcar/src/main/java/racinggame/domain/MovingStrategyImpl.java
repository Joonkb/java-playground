package racinggame.domain;

import java.util.Random;

public class MovingStrategyImpl implements MovingStrategy {

    public static final int BOUND = 4;

    @Override
    public boolean movable() {
        Random random = new Random();
        if (random.nextInt(10) >= BOUND) {
            return true;
        }
        return false;
    }
}
