package nextstep.blackjack.view;

import nextstep.blackjack.domain.Dealer;
import nextstep.blackjack.domain.Deck;
import nextstep.blackjack.domain.Player;
import nextstep.blackjack.domain.User;

import java.util.List;

public class ResultView {

    public static void divideTwoCards(List<Player> players, User dealer, Deck deck) {
        dealer.addCard(deck.getRandomCard());
        dealer.addCard(deck.getRandomCard());
        players.stream().forEach(player -> player.addCard(deck.getRandomCard()));
        players.stream().forEach(player -> player.addCard(deck.getRandomCard()));
    }
}