package baseball.ball;

public enum BallStatus {
    STRIKE,  BALL, NOTHING;

    public boolean isNothing() {
        return this == BallStatus.NOTHING;
    }
};
