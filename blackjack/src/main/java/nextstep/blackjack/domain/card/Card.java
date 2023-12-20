package nextstep.blackjack.domain.card;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {
    private Suit type;
    private Denomination value;

    public Card(Suit type, Denomination value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString() + type.getHangulType();
    }

}
