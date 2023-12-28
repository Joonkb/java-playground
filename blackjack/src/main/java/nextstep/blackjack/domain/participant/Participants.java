package nextstep.blackjack.domain.participant;

import nextstep.blackjack.domain.card.PlayingCard;
import nextstep.blackjack.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

import static nextstep.blackjack.view.InputView.inputPlayersBettingAmt;

public class Participants {

    private Dealer dealer;
    private List<Player> players;

    public Participants(Dealer dealer, List<Player> players) {
        this.dealer = dealer;
        this.players = players;
    }

    public void inputPlayersBettingAmount() {
        players.stream()
                .forEach(player -> inputPlayersBettingAmt(player.getName()));
    }

    /**
     * 딜러와 플레이어들에게 2장의 카드를 분배.
     */
    public void divideTwoCards(PlayingCard deck) {
        OutputView.printDivideTwoCards(playersNames());

        players.forEach(player -> player.receiveTwoCards(deck));
        dealer.receiveTwoCards(deck);

        printCurrentCardStatus();
    }

    private String playersNames() {
        return players.stream()
                .map(player -> player.getName())
                .collect(Collectors.joining(","));
    }

    private void printCurrentCardStatus() {
        OutputView.printCurrentCardList(dealer.getName(), dealer.getCardListWithString(1));
        
        players.stream()
                .forEach(player -> OutputView.printCurrentCardList(player.getName(), player.getCardListWithString(2)));
    }
}