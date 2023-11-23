package nextstep.blackjack.domain;

public enum CardEnum {

    SPADE_2,   SPADE_3,   SPADE_4,   SPADE_5,   SPADE_6,   SPADE_7,   SPADE_8,   SPADE_9,   SPADE_10,   SPADE_J,   SPADE_Q,   SPADE_K,   SPADE_A,
    HEART_2,   HEART_3,   HEART_4,   HEART_5,   HEART_6,   HEART_7,   HEART_8,   HEART_9,   HEART_10,   HEART_J,   HEART_Q,   HEART_K,   HEART_A,
    DIAMOND_2, DIAMOND_3, DIAMOND_4, DIAMOND_5, DIAMOND_6, DIAMOND_7, DIAMOND_8, DIAMOND_9, DIAMOND_10, DIAMOND_J, DIAMOND_Q, DIAMOND_K, DIAMOND_A,
    CLUB_2,    CLUB_3,    CLUB_4,    CLUB_5,    CLUB_6,    CLUB_7,    CLUB_8,    CLUB_9,    CLUB_10,    CLUB_J,    CLUB_Q,    CLUB_K,    CLUB_A

    ;

    public String getCardInfoWithHangul() {
        String type = this.name().split("_")[0];
        return this.name().split("_")[1] + convertToHangulType(type);
    }

    // 카드의 점수를 반환하는 메서드
    public Integer getCardPoint() {
        String name = this.name().split("_")[1];
        if (name.equals("A")) {
            return 11;
        } else if ("JQK".contains(name)) {
            return 10;
        }
        return Integer.parseInt(name);
    }

    private String convertToHangulType(String type) {
        if ("SPADE".equals(type)) {
            return "스페이드";
        } else if ("HEART".equals(type)) {
            return "하트";
        } else if ("DIAMOND".equals(type)) {
            return "다이아몬드";
        }
        return "클로버";
    }

    public boolean isAceCard(CardEnum card) {
        String type = this.name().split("_")[1];
        if ("A".equals(type)) {
            return true;
        }
        return false;
    }
}

