package chapter2;

public class Pratice {
    public static void main(String args[]){
        /**
         * Variable
         */
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age+2000;
        age = age+1;

        System.out.println(year);
        System.out.println(age);

        /**
         * Swap
         */

        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:"+x+" y:"+y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:"+x+" y:"+y);


    }
}
