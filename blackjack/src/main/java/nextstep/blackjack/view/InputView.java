package nextstep.blackjack.view;

import nextstep.blackjack.domain.Deck;
import nextstep.blackjack.domain.Player;
import nextstep.blackjack.domain.User;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static Scanner sc = new Scanner(System.in);

    public static String getPlayerName() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        return sc.next();
    }

    public static void getPlayerBettingAmount(List<Player> players) {
        for (Player player : players) {
            System.out.println(player.getName() + "의 베팅 금액은 ?");
            player.setBettingAmount(sc.nextInt());
            System.out.println();
        }
    }


}