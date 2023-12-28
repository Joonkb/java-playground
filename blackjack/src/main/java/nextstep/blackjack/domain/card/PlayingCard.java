package nextstep.blackjack.domain.card;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlayingCard {

    private static List<Card> deck = new ArrayList<>();
    static {
        Arrays.stream(Suit.values()).forEach(type -> deck.addAll(makeCardListByType(type)));
        Collections.shuffle(deck);
    }

    /**
     * 카드중 랜덤한 카드 한장을 반환한다.
     */
    public static Card getRandomCard() {
        Random random = new Random();
        int randNum = random.nextInt(deck.size());
        return deck.remove(randNum);
    }

    public static List<Card> makeCardListByType(Suit type) {
        return Arrays.stream(Denomination.values())
                .map(value -> new Card(type, value))
                .collect(Collectors.toList());
    }
    /**
     * size만큼 랜덤한 카드를 반환한다.
     */
    public static List<Card> getRandomCardsWithSize(int size) {
        if (getDeckSize() < size) {
            throw new IllegalArgumentException("카드 덱에서 반환할 카드가 부족합니다.");
        }
        return IntStream.range(0, size)
                .mapToObj(x -> getRandomCard()).collect(Collectors.toList());
    }

    private static int getDeckSize() {
        return deck.size();
    }
}