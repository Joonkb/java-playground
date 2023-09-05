package baseball;

import lombok.Getter;

import java.util.List;

@Getter
public class Balls {
    private List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public BallStatus play(Ball userBall) {
        // TODO: 리팩토링
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

    public GameResult play(Balls userBalls) {
        GameResult result = new GameResult();
        for (Ball ball : userBalls.getBalls()) {
            result.make(this.play(ball));
        }
        return result;
    }
}
