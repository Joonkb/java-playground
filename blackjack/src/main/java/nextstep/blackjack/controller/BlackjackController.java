package nextstep.blackjack.controller;

import nextstep.blackjack.domain.card.PlayingCard;
import nextstep.blackjack.domain.participant.Dealer;
import nextstep.blackjack.domain.participant.Participants;

import static nextstep.blackjack.view.InputView.makePlayers;

public class BlackjackController {

    private Participants participants;
    private PlayingCard playingCard;

    public BlackjackController() {
        playingCard  = new PlayingCard();
        participants = new Participants(new Dealer(), makePlayers());
    }

    public void start() {
        participants.inputPlayersBettingAmount();
        participants.divideTwoCards(playingCard);
        participants.askForCardReceiveOrNot(playingCard);
    }
}
