package chapter4_if_for;

public class Exercise4_3 {
    public static void main(String[] args) {
        int max_value = 10;

        int sum = 0;
        for (int i = 1; i <= max_value; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }

        System.out.println("Sum is " + sum);
    }
}
