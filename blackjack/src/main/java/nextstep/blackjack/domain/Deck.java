package nextstep.blackjack.domain;

import java.sql.Array;
import java.util.*;

import static nextstep.blackjack.domain.CardEnum.*;

public class Deck {
    private static List<CardEnum> deck =
            new ArrayList<>(Arrays.stream(values()).toList());

    static {
        Collections.shuffle(deck);
    }

    /**
     * 카드중 랜덤한 카드 한장을 반환한다.
     */
    public static CardEnum getRandomCard() {
        Random random = new Random();
        int randInt = random.nextInt(getDeckSize());
        return deck.remove(randInt);
    }

    public static int getDeckSize() {
        return deck.size();
    }
}