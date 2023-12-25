package nextstep.blackjack.domain.participant;

import nextstep.blackjack.view.InputView;

import java.util.List;

public class Participants {

    private Dealer dealer;
    private List<Player> players;

    public Participants(Dealer dealer, List<Player> players) {
        this.dealer = dealer;
        this.players = players;
    }

    public void SettingPlayersBettingAmount() {
        players.stream()
                .forEach(player -> InputView.inputPlayersBettingAmt(player.getName()));
    }

}
