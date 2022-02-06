package chapter14_lambda_stream;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "DEF", "JKL"}
        );

        Stream<String> strStrm = strArrStrm.flatMap(s -> Arrays.stream(s));
        strStrm.forEach(System.out::println);

        System.out.println("=======================");
        String[] lineArr = {
                "Believe or not It is true",
                "Do or not There is no try"
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
//        lineStream.forEach(System.out::println);
        lineStream.flatMap(line -> Stream.of(line.split(" ")))
                .map(s -> s.toLowerCase(Locale.ROOT))
                .distinct()
                .sorted()
                .forEach(s -> System.out.println(s));
    }
}
