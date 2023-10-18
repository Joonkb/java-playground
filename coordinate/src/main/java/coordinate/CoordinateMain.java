package coordinate;

import coordinate.domain.Shape;
import coordinate.domain.Triangle;
import coordinate.utils.ParsingUtils;
import coordinate.view.DrawView;
import coordinate.view.InputView;

import static coordinate.utils.ParsingUtils.*;
import static coordinate.view.InputView.*;

public class CoordinateMain {

    public static void main(String[] args) {
        play();        
    }

    private static void play() {
        Shape triangle = new Triangle(parse(getInput()));
        DrawView.drawCoordinate(triangle);
    }
}
