package nextstep.blackjack.domain.card;

public enum Suit {
    CLUBS("클로버"),
    DIAMONDS("다이아몬드"),
    HEARTS("하트"), 
    SPADES("스페이드");

    private String hangulType;

    Suit(String hangulType) {
        this.hangulType = hangulType;
    }

    public String getHangulType() {
        return hangulType;
    }
}
