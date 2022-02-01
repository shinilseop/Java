package chapter6_OOP1;

public class Exercise6_22 {
    public static boolean isNumber(String num) {
        for (int i = 0; i < num.length(); i++) {
            char num_ch = num.charAt(i);
            if (!(('0' <= num_ch) && (num_ch <= '9'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str ="123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str ="1234ㅇ";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
