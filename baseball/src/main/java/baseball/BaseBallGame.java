package baseball;

import baseball.ball.Balls;
import baseball.utils.NumberGenerator;
import baseball.view.InputView;
import baseball.view.ResultView;

import java.util.Scanner;

public class BaseBallGame {

    private static Scanner sc = new Scanner(System.in);

    private static void gameStart() {
        do {
            gamePlaying();
        } while(validateNextGame());
    }

    private static void gamePlaying() {

        boolean gameStopYn   = true;
        Balls computerBalls  = new Balls(NumberGenerator.createRandomNumber());

        while (gameStopYn) {
            // 사용자 프로세스 진행
            GameResult result = playGameUserTurn(computerBalls);

            // 게임결과 출력
            ResultView.getGameResultString(result);

            // Game 종료여부 check
            gameStopYn = result.isGameStop();
        }
    }

    private static GameResult playGameUserTurn(Balls computerBalls) {
        InputView.getUserInputString();
        Balls userBalls = new Balls(sc.next());
        return computerBalls.play(userBalls);
    }

    private static boolean validateNextGame() {
        ResultView.getGameEndString();
        int userGameEndYn = sc.nextInt();
        if (userGameEndYn == GameStatus.EXIT.getValue()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        gameStart();
    }
}
