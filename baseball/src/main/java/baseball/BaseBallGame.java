package baseball;

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
        boolean gameStopYn = true;
        while (gameStopYn) {
            // 사용자 프로세스 진행
            GameResult result = processUserStep(engine);

            // 게임결과 출력
            ResultView.getGameResultString(result);

            // Game 종료여부 check
            gameStopYn = result.isGameStop();
        }
    }

    private static boolean validateNextGame() {
        int userGameEndYn = sc.nextInt();
        if (userGameEndYn == 2) return false;
        return true;
    }


    public static void main(String[] args) {
        gameStart();
    }
}
