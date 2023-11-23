package nextstep.blackjack.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Player extends User{

    private Integer bettingAmount;
    private String name;

    public Player(String name) {
        super();
        this.name = name;
        this.bettingAmount = 0;
    }
}
