package chapter4_if_for;

public class Exercise4_2 {
    public static void main(String[] args) {
        int max_value = 20;

        int sum=0;
        for (int i = 0; i <= max_value; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                continue;
            }

            sum+=i;
        }

        System.out.println("Sum is "+sum);
    }
}
