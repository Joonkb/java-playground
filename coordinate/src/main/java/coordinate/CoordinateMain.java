package coordinate;

import coordinate.domain.Shape;
import coordinate.utils.ShapeCreator;
import coordinate.view.DrawView;
import coordinate.view.ResultView;

import static coordinate.utils.ParsingUtils.*;
import static coordinate.view.InputView.*;

public class CoordinateMain {

    public static void main(String[] args) {
        gameStart();
    }

    private static void gameStart() {
        while (true) {
            try {
                play();
                break;
            } catch (Exception e) {
                System.out.println("Error: [" + e.getMessage() + "] ");
            }
        }
    }

    private static void play() {
        // 팩토리 메서드 패턴 적용 (팩토리에서 Shape을 구현한 클래스 인스턴스 반환).
        Shape shape = ShapeCreator.createShape(parse(getInput()));
        DrawView.drawCoordinate(shape);
        ResultView.printCalculatedArea(shape);
    }
}