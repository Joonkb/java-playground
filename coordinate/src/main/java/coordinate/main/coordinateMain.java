package coordinate.main;

import coordinate.domain.Figure;
import coordinate.factory.FigureFactory;
import coordinate.view.ResultView;

import static coordinate.utils.ParsingUtils.parse;
import static coordinate.view.InputView.getInput;

public class coordinateMain {
    public static void main(String[] args) {
        gameStart();
    }

    private static void gameStart() {
        while (true) {
            try {
                play();
                break;
            } catch (Exception e) {
                System.out.println("#### Error: [" + e.getMessage() + "] #####");
            }
        }
    }

    private static void play() {
        // Factory method Pattern 적용
        Figure figure = FigureFactory.createFigure(parse(getInput()));
        ResultView.printCalculatedArea(figure);
    }
}

