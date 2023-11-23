package nextstep.blackjack.domain;

import java.sql.Array;
import java.util.*;

import static nextstep.blackjack.domain.CardEnum.*;

public class Deck {
    private static List<CardEnum> deck;
    static {
        // TODO: Enum 에서 반환받도록 수정할 것.
        deck =  new ArrayList<>(Arrays.asList(
                SPADE_2,   SPADE_3,   SPADE_4,   SPADE_5,   SPADE_6,   SPADE_7,   SPADE_8,   SPADE_9,   SPADE_10,   SPADE_J,   SPADE_Q,   SPADE_K,   SPADE_A,
                HEART_2,   HEART_3,   HEART_4,   HEART_5,   HEART_6,   HEART_7,   HEART_8,   HEART_9,   HEART_10,   HEART_J,   HEART_Q,   HEART_K,   HEART_A,
                DIAMOND_2, DIAMOND_3, DIAMOND_4, DIAMOND_5, DIAMOND_6, DIAMOND_7, DIAMOND_8, DIAMOND_9, DIAMOND_10, DIAMOND_J, DIAMOND_Q, DIAMOND_K, DIAMOND_A,
                CLUB_2,    CLUB_3,    CLUB_4,    CLUB_5,    CLUB_6,    CLUB_7,    CLUB_8,    CLUB_9,    CLUB_10,    CLUB_J,    CLUB_Q,    CLUB_K,    CLUB_A
        ));
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
