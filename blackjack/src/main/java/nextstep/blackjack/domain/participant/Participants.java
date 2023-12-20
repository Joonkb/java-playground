package nextstep.blackjack.domain.participant;

import java.util.List;

public class Participants {

    private Dealer dealer;
    private List<Player> player;

    public Participants(Dealer dealer, List<Player> player) {
        this.dealer = dealer;
        this.player = player;
    }


}
