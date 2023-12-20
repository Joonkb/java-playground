package nextstep.blackjack.domain.card;

import java.util.*;
import java.util.stream.Collectors;

public class PlayingCard {

    private static List<Card> deck = new ArrayList<>();
    static {
        Arrays.stream(Suit.values()).forEach(type -> deck.addAll(makeCardListByType(type)));
        Collections.shuffle(deck);
    }

    public Card getRandomCard() {
        Random random = new Random();
        int randNum = random.nextInt(deck.size());
        return deck.remove(randNum);
    }

    public static List<Card> makeCardListByType(Suit type) {
        return Arrays.stream(Denomination.values())
                .map(value -> new Card(type, value)).collect(Collectors.toList());
    }
}