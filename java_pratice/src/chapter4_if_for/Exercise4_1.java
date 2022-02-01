package chapter4_if_for;

public class Exercise4_1 {
    public static void main(String[] args) {
        int x = 15;
        if ((10 < x) && (x < 20)) {
            System.out.println("x is 10~20");
        }

        char ch = 'A';
        if(!(ch == ' ' && ch == '\t')){
           System.out.println("ch is not blank and tab.");
        }

        char ch1 = 'x';
        if ((ch1 == 'x') && (ch1 == 'X')) {
            System.out.println("ch1 is x or X.");
        }

        char ch2 = '5';
        if (('0' <= ch2) && (ch2 <= '9')) {
            System.out.println("ch2 is '0' ~ '9'.");
        }

        char ch3 = 'x';
        if ((('a' <= ch3) && (ch3 <= 'z')) || (('A' <= ch3) && (ch3 <= 'Z'))) {
            System.out.println("ch3 is alphabet.");
        }

        int year = 404;
        if((year%400==0)||((year%4==0)&&(year%100!=0))){
            System.out.println("year is yun year.");
        }

        boolean powerOn=true;
        if (powerOn) {
            System.out.println("powerOn");
        }

        String str = "yes";
        if (str.equals("yes")) {
            System.out.println("str is yes.");
        }
    }
}
