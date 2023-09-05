package baseball.view;

import baseball.GameResult;

public class ResultView {
    public static void getGameResultString(GameResult result) {
        int ball = result.getBall();
        int strike = result.getStrike();

        String resultStr = "";
        if(ball != 0) resultStr +=  (ball + "볼 ");
        if(strike != 0) resultStr += (strike + "스트라이크");
        System.out.println(resultStr);
    }
    public static void getGameEndString() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}