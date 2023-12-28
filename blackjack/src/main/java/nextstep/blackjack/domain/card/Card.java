package nextstep.blackjack.domain.card;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {
    private final Suit type;
    private final Denomination value;

    public Card(Suit type, Denomination value) {
        this.type = type;
        this.value = value;
    }

    public int getScore() {
        return value.getScore();
    }

    public boolean isAceCard() {
        return value.isAceCard();
    }


    @Override
    public String toString() {
        return value.toString() + type.getHangulType();
    }

}
