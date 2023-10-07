package racinggame.domain;

import java.util.Random;

//TODO: 네이밍 고민
public class MovingStrategyImpl implements MovingStrategy {

    public static final int MAX = 10;
    public static final int BOUND = 4;

    @Override
    public boolean movable() {
        Random random = new Random();
        if (random.nextInt(MAX) >= BOUND) {
            return true;
        }
        return false;
    }
}
