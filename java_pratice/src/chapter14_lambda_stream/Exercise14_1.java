package chapter14_lambda_stream;

import java.util.function.Function;

public class Exercise14_1 {
    int max(int a,  int b) {
        return a > b ? a : b;
//        (int a, int b) -> a>b? a:b
    }

    void printVar(String name, int i) {
        System.out.println(name + "=" + i);
//        (String name2, int i2) -> {System.out.println(name2+"="+i2);};
    }

    int square(int x) {
        return x * x;
//        (int a) -> a*a;
    }

    int roll() {
        return (int) (Math.random() * 6);
//        () -> (int) (Math.random() * 6);
    }

    int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
//        (int[] arr2) -> {
//                int sum2 = 0;
//                for (int num:arr) {
//                  sum2+=num;
//                }
//                return sum2;
//                };
    }

    int[] emptyArr() {
        return new int[]{};
//        ()->new int[]{};
    }

    public static void main(String[] args) {

    }
}
