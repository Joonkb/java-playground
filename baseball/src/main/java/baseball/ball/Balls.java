package baseball.ball;

import baseball.GameResult;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Balls {
    private List<Ball> balls;

    public Balls() {
        balls = new ArrayList<>();
    }
    
    // TODO: 사용자의 입력도 같은 생성자를 사용하도록 수정 , CONVERT 사용해서 맞춰볼것 테스트를 위함.
    
    public Balls(String userBalls) {
        this();
        for (int digit = 0; digit < 3; ++digit) {
            int number = userBalls.charAt(digit) - '0';
            balls.add(new Ball(number, digit + 1));
        }
    }

    public Balls(List<Integer> randomNumber) {
        this();
        for (int order = 0; order < 3; order++) {
            balls.add(new Ball(randomNumber.get(order), order + 1));
        }
    }
    
    // TODO: 정상적으로 동작하는지 다양한 TESTCASE 확인 필요.
    public BallStatus play(Ball userBall) {
        return balls.stream()
                .map(ball -> ball.play(userBall))
                .filter(status -> status != BallStatus.NOTHING) // TODO: Enum한테 물어보는 방식으로 수정
                .findAny()
                .orElse(BallStatus.NOTHING);
    }

    public void addBall(Ball ball) { balls.add(ball); }

    /**
     * 컴퓨터의 Balls와 유저의 Balls 를 비교하여
     * GameResult를 반환한다.
     * @param userBalls : 유저의 Balls
     * @return GameResult
     */
    public GameResult play(Balls userBalls) {
        GameResult result = new GameResult();
        for (Ball ball : userBalls.getBalls()) {
            result.make(this.play(ball));
        }
        return result;
    }
}
