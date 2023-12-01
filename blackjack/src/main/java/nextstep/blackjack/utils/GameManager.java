package nextstep.blackjack.utils;

import nextstep.blackjack.domain.Deck;
import nextstep.blackjack.domain.Player;
import nextstep.blackjack.domain.User;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 게임 진행에 필요한
 * 유틸성 STATIC 메서드를 모아놓음
 */
public class GameManager {

    private static Scanner sc = new Scanner(System.in);

    public static void divideTwoCards(List<Player> players, User dealer, Deck deck) {

        String names = players.stream()
                .map(e-> e.getName())
                .collect(Collectors.joining(","));

        System.out.println("딜러와 " + names +"에게 두 장을 나누었습니다.");
        dealer.addCards(deck.getRandomCardsWithSize(2));
        players.stream().forEach(player -> player.addCards(deck.getRandomCardsWithSize(2)));
    }

    /**
     *  한 장씩 더 받을 건지 처리하기.
     */
    public static void askForCardReceiveOrNot(List<Player> players, User dealer, Deck deck) {
        // 플레이어 처리
        players.stream().forEach(player -> askForPlayer(player, deck));
        // 딜러의 처리
        processForDealer(dealer, deck);
    }

    /**
     * 플레이어의 카드처리
     */
    private static void askForPlayer(User user, Deck deck) {
        String yesOrNo;
        do {
            System.out.println(getUserName(user) + "는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)");
            yesOrNo = sc.next();
            user.addCard(deck.getRandomCard());
        } while ("y".equals(yesOrNo) && !user.exceedBlackJackScoreYn());
    }

    /**
     * 딜러의 카드처리
     */
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
