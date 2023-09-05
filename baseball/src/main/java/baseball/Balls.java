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
//        for (Ball computerBall : balls) {
//            if (computerBall.equals(userBall)) {
//                return BallStatus.STRIKE;
//            }
//            if(computerBall.play(userBall) == BallStatus.BALL){
//                return BallStatus.BALL;
//            }
//        }

//        return BallStatus.NOTHING;

        return balls.stream()
                .map(ball -> ball.play(userBall))
                .filter(status -> status != BallStatus.STRIKE)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public GameResult play(Balls userBalls) {
        GameResult result = new GameResult();
        for (Ball ball : userBalls.getBalls()) {
            result.make(this.play(ball));
        }
        return result;
    }
}
