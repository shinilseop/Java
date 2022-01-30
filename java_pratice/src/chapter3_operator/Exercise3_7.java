package chapter3_operator;

public class Exercise3_7 {
    public static void main(String[] args){
        /**
         * 화씨 -> 섭씨, 셋쨰 자리에서 반올림
         */
        int fahrenheit = 100;
        float celcius = ((float)5/9) * ((float)fahrenheit-32);

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+(int)((celcius*100)+0.5)/100.0);
    }
}
