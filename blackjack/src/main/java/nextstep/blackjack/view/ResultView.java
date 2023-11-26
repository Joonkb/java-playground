package nextstep.blackjack.view;

import nextstep.blackjack.domain.Dealer;
import nextstep.blackjack.domain.Deck;
import nextstep.blackjack.domain.Player;
import nextstep.blackjack.domain.User;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public static void divideTwoCards(List<Player> players, User dealer, Deck deck) {

        String names = players.stream()
                .map(e-> e.getName())
                .collect(Collectors.joining(","));

        System.out.println("딜러와 " + names +"에게 두 장을 나누었습니다.");
        dealer.addCard(deck.getRandomCard());
        dealer.addCard(deck.getRandomCard());
        players.stream().forEach(player -> player.addCard(deck.getRandomCard()));
        players.stream().forEach(player -> player.addCard(deck.getRandomCard()));
    }

    public static void showUserScoreInfo(User dealer, List<Player> players) {
        System.out.println("딜러 카드: "  + dealer.showUserCards(52) + " - 결과: " + dealer.calculateCardScore());
        players.stream().forEach(player -> System.out.println(
                player.getName() + "카드: " +
                player.showUserCards(52) + " - 결과: " +
                player.calculateCardScore()));
    }

}