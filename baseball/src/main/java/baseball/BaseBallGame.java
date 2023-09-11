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

        Balls computerBalls  = new Balls(NumberGenerator.createRandomNumber());

        boolean gameStopYn   = true;
        while (gameStopYn) {
            // 사용자 프로세스 진행
            GameResult result = playGameUserTurn(computerBalls);

            // 게임결과 출력
            ResultView.getGameResultString(result);

            // Game 종료여부 check
            gameStopYn = result.isGameStop();
        }
    }

    /**
     * 사용자의 입력을 받아 처리한다.
     * @param computerBalls
     * @return GameResult
     */
    private static GameResult playGameUserTurn(Balls computerBalls) {
        InputView.getUserInputString();
        Balls userBalls = new Balls(sc.next());
        return computerBalls.play(userBalls);
    }

    /**
     * 다음게임 진행여부를 검증한다.
     * @return
     */
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
