package coordinate.view;

import java.util.Scanner;

public class InputView {
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        return sc.next();
    }
}
