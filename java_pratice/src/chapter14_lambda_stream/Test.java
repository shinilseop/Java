package chapter14_lambda_stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(1, 46);

        intStream.limit(45).forEach(i -> System.out.println(i));

        System.out.println("=======================");

        IntStream charStream = "12345".chars();
        charStream.forEach(System.out::println);
    }
}
