package chapter3_operator;

public class Exercise3_6 {
    public static void main(String[] args) {
        /**
         * 가까운 10의 배수에서 원래 숫자값 빼기
         */
        int num = 24;

        System.out.println((int)(Math.ceil((double)num/10)*10)-num);
        System.out.println(10-(num%10));
    }
}
