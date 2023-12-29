package nextstep.blackjack.domain.participant;

import nextstep.blackjack.domain.card.PlayingCard;
import nextstep.blackjack.utils.CCM;
import nextstep.blackjack.view.InputView;
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
        while (dealer.calculateCardScore() <= 16) {
            dealer.addCard(deck);
            receiveCount++;
        }
        if (receiveCount > 0) {
            System.out.println("\n딜러는 16이하라 " + receiveCount + "장의 카드를 더 받았습니다.\n");
        } else {
            System.out.println("\n딜러는 17점 초과라 카드를 추가로 받지 않았습니다.\n");
        }
    }

    private void processForPlayer(Player player, PlayingCard deck) {
        do {
            OutputView.printAskForOneMoreCard(player.getName());
            if (InputView.getOneMoreCardOrNot()) {
                break;
            }
            player.addCard(deck);
        } while(true);
    }
}