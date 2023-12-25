package nextstep.blackjack.view;

import nextstep.blackjack.domain.participant.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    private static final String PARTICIPANT_BETTING_AMT_INPUT_MSG    =  "%s의 배팅금액은?";
    private static final String PARTICIPANT_NAME_INPUT_MSG           =  "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";

    public static List<Player> makePlayers() {
        OutputView.print(PARTICIPANT_NAME_INPUT_MSG);
        return Arrays.stream(readConsole().split(","))
                .map(name -> new Player(name))
                .collect(Collectors.toList());
    }

    public static int inputPlayersBettingAmt(String name) {
        OutputView.printByFormat(PARTICIPANT_BETTING_AMT_INPUT_MSG, name);
        return sc.nextInt();
    }

    private static String readConsole() {
        return sc.next();
    }

}
