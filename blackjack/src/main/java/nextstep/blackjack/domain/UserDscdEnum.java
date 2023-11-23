package nextstep.blackjack.domain;

public enum UserDscdEnum {

    PLAYER("플레이어"), DEALER("딜러");

    private String value;

    UserDscdEnum(String value) {
        this.value = value;
    }
}
