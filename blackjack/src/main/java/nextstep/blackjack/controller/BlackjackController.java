package nextstep.blackjack.controller;

import nextstep.blackjack.domain.card.PlayingCard;
import nextstep.blackjack.domain.participant.Dealer;
import nextstep.blackjack.domain.participant.Participants;

import static nextstep.blackjack.view.InputView.makePlayers;

public class BlackjackController {

    private Participants participants;
    private PlayingCard playingCard;

    public BlackjackController() {
        playingCard = new PlayingCard();
    }

    public void start() {
        Participants participants = new Participants(new Dealer(), makePlayers());

        participants.inputPlayersBettingAmount();        /* 배팅금액 세팅      */
        participants.divideTwoCards(playingCard);        /* 두 장의 카드 분배. */

    }

}
