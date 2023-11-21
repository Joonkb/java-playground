package nextstep.blackjack.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Player extends User{

    private String name;
    private Integer bettingAmount;

    public Player(String name) {
        this.name = name;
    }
}
