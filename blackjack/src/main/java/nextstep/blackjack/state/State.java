package nextstep.blackjack.state;

import nextstep.blackjack.domain.card.Cards;
import nextstep.blackjack.domain.card.PlayingCard;

public interface State {

    State draw(PlayingCard card);
    State stay();

    boolean isFinished();
    Cards cards();
    double profit(double x);
}
