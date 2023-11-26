package nextstep.blackjack.view;

import nextstep.blackjack.domain.Deck;
import nextstep.blackjack.domain.Player;
import nextstep.blackjack.domain.User;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static Scanner sc = new Scanner(System.in);
    private static final int DEALER_VALUE = 17;

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

    public static void askForCardReceiveOrNot(List<Player> players, User dealer, Deck deck) {
        players.stream().forEach(player -> askForPlayer(player, deck));

        /** 딜러의 경우 카드를 그냥 받아야 함. **/
        processForDealer(dealer, deck);
    }

    private static void askForPlayer(User user, Deck deck) {
        String yesOrNo;
        do {
            System.out.println(getUserName(user) + "는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
            yesOrNo = sc.next();
            user.addCard(deck.getRandomCard());
        } while ("y".equals(yesOrNo) && !user.exceedBlackJackScoreYn());
    }

    /** 딜러의 카드처리  **/
    private static void processForDealer(User user, Deck deck) {
        int receiveCount = 0;
        while (user.calculateCardScore() <= 16) {
            user.addCard(deck.getRandomCard());
            receiveCount++;
        }
        if (receiveCount > 0) {
            System.out.println("\n딜러는 16이하라 " + receiveCount + "장의 카드를 더 받았습니다.");
        } else {
            System.out.println("\n딜러는 17점 초과라 카드를 추가로 받지 않았습니다.");
        }
    }

    private static String getUserName(User user) {
        String name = "딜러";
        if (user instanceof Player) {
            name = ((Player) user).getName();
        }
        return name;
    }
}