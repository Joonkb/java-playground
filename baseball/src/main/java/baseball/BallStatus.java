package baseball;

public enum BallStatus {
    STRIKE,  BALL, NOTHING;

    public boolean isNothing() {
        return this == BallStatus.NOTHING;
    }
};
