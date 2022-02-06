package chapter14_lambda_stream;

import java.util.Collection;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_7 {
    public static void main(String[] args) {
        new Random().ints(1, 46)
                .distinct()
                .limit(6)
                .sorted().forEach(System.out::println);
    }
}
