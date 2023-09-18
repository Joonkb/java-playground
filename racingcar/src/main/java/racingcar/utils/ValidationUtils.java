package racingcar.utils;

public class ValidationUtils {

    private static final int MAX_LENGTH  = 5;

    public static boolean validateCarName(String carName) {
        int nameLength = carName.length();
        if(nameLength > MAX_LENGTH ) {
            return false;
        }
        return true;
    }
}
