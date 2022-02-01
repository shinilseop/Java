package chapter4_if_for;

public class Exercise4_7 {
    public static void main(String[] args) {

        for(int i=0;i<10;i++) {
            int value = (int) (Math.random() * 6 + 1);

            System.out.println("value : " + value);
        }
    }
}
