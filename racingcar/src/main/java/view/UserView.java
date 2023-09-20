package view;

public class UserView {

    public static void description() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void userInputDesc() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public static void resultDesc() {
        System.out.println("\n실행 결과");
    }

    public static void getClosingDesc(String names) {
        System.out.println(names + "가 최종 우승했습니다.");
    }
}
