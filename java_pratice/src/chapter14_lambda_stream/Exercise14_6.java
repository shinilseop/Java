package chapter14_lambda_stream;

import java.util.OptionalInt;
import java.util.stream.Stream;

public class Exercise14_6 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        Stream<String> strStream = Stream.of(strArr);

        OptionalInt max = strStream.mapToInt(s -> s.length()).max();
        System.out.println(max.getAsInt());
    }
}
