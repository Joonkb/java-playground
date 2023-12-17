package nextstep.blackjack.State;

import nextstep.blackjack.domain.Cards;
import nextstep.blackjack.domain.PlayingCard;

public interface State {

    State draw(PlayingCard card);
    State stay();

    boolean isFinished();
    Cards cards();
    double profit(double x);
}
