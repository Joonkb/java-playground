package nextstep.blackjack.utils;

import nextstep.blackjack.domain.Player;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParsingUtils {

    public static List<Player> parse(String exp) {
        return Arrays.asList(exp.split(","))
                .stream()
                .map(name -> new Player(name))
                .collect(Collectors.toList());
    }
}
