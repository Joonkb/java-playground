package nextstep.blackjack;

import nextstep.blackjack.domain.Dealer;
import nextstep.blackjack.domain.Deck;
import nextstep.blackjack.domain.Player;
import nextstep.blackjack.domain.User;
import nextstep.blackjack.view.ResultView;

import java.util.List;

import static nextstep.blackjack.utils.ParsingUtils.parse;
import static nextstep.blackjack.view.InputView.*;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();

        // 플레이어 베팅금액 세팅
        List<Player> players = parse(getPlayerName());
        getPlayerBettingAmount(players);

        // 딜러, 플레이어 2장의 카드 분배
        User dealer = new Dealer();
        ResultView.divideTwoCards(players, dealer, deck);

        System.out.print("딜러: ");
        System.out.println(dealer.showUserCards());
        players.stream().forEach(player -> System.out.println(player.getName() +": "+ player.showUserCards()));
    }
}
