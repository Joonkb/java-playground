package nextstep.blackjack.domain.participant;

import nextstep.blackjack.domain.card.PlayingCard;
import nextstep.blackjack.view.InputView;
import nextstep.blackjack.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

import static nextstep.blackjack.utils.CCM.DEALER_BUST_SCORE;
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

    /**
     * 한 장 더 받을 건지 처리한다.
     */
    public void askForCardReceiveOrNot(PlayingCard deck) {
        players.stream()
                .forEach(player -> processForPlayer(player, deck));

        processForDealer(deck);
    }

    private void processForDealer(PlayingCard deck) {
        int receiveCount = 0;
        while (dealer.calculateCardScore() <= DEALER_BUST_SCORE) {
            dealer.addCard(deck);
            receiveCount += 1;
        }
        if (receiveCount > 0) {
            OutputView.printHowManyCardReceive(receiveCount);
        } else {
            OutputView.printDealerExceededScore();
        }
    }

    private void processForPlayer(Player player, PlayingCard deck) {
        do {
            OutputView.printAskForOneMoreCard(player.getName());
            if (InputView.getOneMoreCardOrNot()) {
                break;
            }
            player.draw(deck);
        } while (player.isBust());
    }
}