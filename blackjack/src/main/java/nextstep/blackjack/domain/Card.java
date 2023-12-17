package nextstep.blackjack.domain;

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
        return "Card{" +
                "type=" + type +
                ", value=" + value +
                '}';
    }
}
