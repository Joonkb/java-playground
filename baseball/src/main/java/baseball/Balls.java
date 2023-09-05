package baseball;

import java.util.List;

public class Balls {
    private List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public BallStatus play(Ball userBall) {
        // TODO: 리팩토링 ->
        BallStatus ballStatus = BallStatus.NOTHING;
        for (Ball computerBall : balls) {
            if (computerBall.equals(userBall)) {
                return BallStatus.STRIKE;
            }
            if(computerBall.play(userBall) == BallStatus.BALL){
                return BallStatus.BALL;
            }
        }
        return ballStatus;
    }

    GameResult play(Balls userBalls) {

    }

}
