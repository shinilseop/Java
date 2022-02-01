package chapter4_if_for;

public class Exercise4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
    }
}
