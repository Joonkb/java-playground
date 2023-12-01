package nextstep.blackjack.domain;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        if(getDeckSize() == 0) {
            throw new IllegalArgumentException("덱에서 반환할 카드가 부족합니다.");
        }
        int randInt = random.nextInt(getDeckSize());
        return deck.remove(randInt);
    }

    /**
     * size 만큼 카드 여러 장을 반환한다.
     */
    public static List<CardEnum> getRandomCardsWithSize(int size) {
        if (getDeckSize() < size) {
            throw new IllegalArgumentException("카드 덱에서 반환할 카드가 부족합니다.");
        }
        return IntStream.range(0, size)
                .mapToObj(x -> getRandomCard()).collect(Collectors.toList());
    }

    public static int getDeckSize() {
        return deck.size();
    }
}