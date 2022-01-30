package chapter2_variable;

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

        /**
         * String
         */

        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7+" ");
        System.out.println(" "+7);
        System.out.println(7+"");
        System.out.println(""+7);
        System.out.println(""+"");
        System.out.println(7+7+"");
        System.out.println(""+7+7);

        short short_max = Short.MAX_VALUE;
        short short_min = Short.MIN_VALUE;
        System.out.println("Short Range : "+short_max+"~"+short_min);
        int int_max = Integer.MAX_VALUE;
        int int_min = Integer.MIN_VALUE;
        System.out.println("Integer Range : "+int_max+"~"+int_min);
        float float_max = Float.MAX_VALUE;
        float float_min = Float.MIN_VALUE;
        System.out.println("Float Range : "+float_max+"~"+float_min);
        double double_max = Double.MAX_VALUE;
        double double_min = Double.MIN_VALUE;
        System.out.println("Double Range : "+double_max+"~"+double_min);


        /**
         * Overflow Test
         */

        System.out.println(Integer.MAX_VALUE+1+"=="+Integer.MIN_VALUE);

        float f_test = (float)1.0e100;
        System.out.println(f_test);
        f_test = (float)-1.0e100;
        System.out.println(f_test);
        f_test = (float)1.0e38;
        System.out.println(f_test);


        /**
         * Precision Diff
         */
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double) f;
        System.out.printf("f =%20.18f\n", f);
        System.out.printf("d =%20.18f\n", d);
        System.out.printf("d2 =%20.18f\n", d2);
    }
}
