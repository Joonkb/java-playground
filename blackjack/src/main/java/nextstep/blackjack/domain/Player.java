package nextstep.blackjack.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Player extends User{

    private String name;
    private Integer bettingAmount;

    public Player(String name) {
        this.name = name;
    }

}
