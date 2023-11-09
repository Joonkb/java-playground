package nextstep.fp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamStudy {

    public static long countWords() throws IOException {
        String contents = new String(Files.readAllBytes(Paths
                .get("C:\\Users\\NB-21122726\\Desktop\\java-playground\\blackjack\\src\\main\\java\\resources\\fp\\war-and-peace.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        long count = 0;
        for (String w : words) {
            if (w.length() > 12) count++;
        }
        return count;
    }

    public static void printLongestWordTop100() throws IOException {
        String contents = new String(Files.readAllBytes(Paths
                .get("C:\\Users\\NB-21122726\\Desktop\\java-playground\\blackjack\\src\\main\\java\\resources\\fp\\war-and-peace.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        // 상위 100개만 어떻게 추출?
        words.stream().filter(w -> w.length() > 12)
                .map(s -> s.toLowerCase())
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }

    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        return numbers.stream().map(x -> 2 * x).collect(Collectors.toList());
    }

    public static long sumAll(List<Integer> numbers) {
        return numbers.stream().reduce(0, (x, y) -> x + y);
    }

    public static long sumOverThreeAndDouble(List<Integer> numbers) {

        return numbers.stream()
                .filter(x -> x > 3)
                .map(x -> x * 2)
                .reduce((x, y) -> (x + y)).get();
    }
}