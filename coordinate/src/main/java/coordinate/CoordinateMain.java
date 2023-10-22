package coordinate;

import coordinate.domain.Shape;
import coordinate.utils.ShapeCreator;

import static coordinate.utils.ParsingUtils.*;
import static coordinate.view.DrawView.drawCoordinate;
import static coordinate.view.InputView.*;

public class CoordinateMain {

    public static void main(String[] args) {
        play();        
    }

    private static void play() {
        // 팩토리 메서드 패턴 적용, 패턴에서 Shape을 구현한 클래스 인스턴스 반환.
        Shape shape = ShapeCreator.createShape(parse(getInput()));
        drawCoordinate(shape);
    }
}