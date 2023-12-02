package nextstep.blackjack.view;

import nextstep.blackjack.domain.Dealer;
import nextstep.blackjack.domain.Deck;
import nextstep.blackjack.domain.Player;
import nextstep.blackjack.domain.User;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    private static final int HOW_MANY_SHOW_DEALER = 1;
    private static final int HOW_MANY_SHOW_PLAYER = 2;

    public static void showUserCardInfo(User dealer, List<Player> players) {
        System.out.print("딜러: "); System.out.println(dealer.showUserCards(HOW_MANY_SHOW_DEALER));
        players.stream().forEach(player -> System.out.println(player.getName() +": "+ player.showUserCards(HOW_MANY_SHOW_PLAYER)));
    }

    public static void showUserScoreInfo(User dealer, List<Player> players) {
        System.out.println("딜러 카드: "  + dealer.showUserCards(52) + " - 결과: " + dealer.calculateCardScore());
        players.stream().forEach(player -> System.out.println(
                player.getName() + "카드: " +
                player.showUserCards(52) + " - 결과: " +
                player.calculateCardScore()));
    }
}