package chapter14_lambda_stream;

import chapter12_gener_enum_anno.Card;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.IntStream;

public class Exercise14_2 {
    // 1. (String s) -> s.length()
    // 2. ()-> new int[]{}
    // 3. arr -> Arrays.stream(arr)
    // 4. (String str1, String str2) -> str1.equals(str2)
    // 5. (a, b) -> Integer.compare(a, b)
    // 6. (String kind, int num) -> new Card(kind, num)
    // 7. (x) -> System.out.println(x)
    // 8. ()-> Math.random()
    // 9. (str) -> str.toUpperCase()
    //10. () -> new NullPointerException()
    //11. (Optional opt) -> opt.get()
    //12. (StringBuffer sb, String s) -> sb.append(s)
    //13. (String s) -> System.out.println(s)
    //1
    int strLength(String s) {
        return s.length();
    } // String::length
    //2
    int[] emptyArr() {
        return new int[]{};
    } // int[]::new;
    //3
    IntStream arraysStream(int[] arr) {
        return Arrays.stream(arr);
    } // Arrays::stream
    //4
    boolean isSame(String str1, String str2) {
        return str1.equals(str2);
    } // String::equals
    //5
    int compareInt(int a, int b) {
        return Integer.compare(a, b);
    } // Integer::compare
    //6
    Card createCard(String kind, int num) {
        return new Card(Card.Kind.CLOVER, Card.Number.TWO);
    } // Card::new
    //7
    void print(Object x) {
        System.out.println(x);
    } // System.out::println
    //8
    double randomNumber() {
        return Math.random();
    } // Math::random
    //9
    String upAlphabet(String str) {
        return str.toUpperCase();
    } // String::toUpperCase
    //10
    Object getOptional(Optional opt) {
        return opt.get();
    } // Optional::get
    //11
    StringBuffer appendStr(StringBuffer sb, String s) {
        return sb.append(s);
    } // StringBuffer::append

    //12
    void printString(String s) {
        System.out.println(s);
    } // System.out::println
}
