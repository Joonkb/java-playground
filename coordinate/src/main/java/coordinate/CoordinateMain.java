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
        // Factory method Pattern 적용
        Shape shape = ShapeCreator.createShape(parse(getInput()));
        DrawView.drawCoordinate(shape);
        ResultView.printCalculatedArea(shape);
    }
}