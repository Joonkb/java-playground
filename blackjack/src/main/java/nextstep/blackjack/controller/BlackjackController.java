package nextstep.blackjack.controller;

import nextstep.blackjack.domain.participant.Dealer;
import nextstep.blackjack.domain.participant.Participants;

import static nextstep.blackjack.view.InputView.makePlayers;

public class BlackjackController {

    private Participants participants;

    public void start() {
        Participants participants = new Participants(new Dealer(), makePlayers());
        participants.SettingPlayersBettingAmount();
    }

    public void run() {

    }

}
