package chapter4_if_for;

public class Exercise4_12 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i += 3) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i+"*"+j+"="+(i*j));
                System.out.print("\t"+(i+1)+"*"+j+"="+(i*j));
                if (i+2!=10)
                    System.out.println("\t"+(i+2)+"*"+j+"="+(i*j));
                else
                    System.out.println();
            }
            System.out.println();
        }
    }
}
