package chapter9_lang_utils;

public class Exercise9_8 {
    public static double round(double d, int n) {
        double multiValue = Math.pow(10, n);

        return Math.round(d * multiValue) / (multiValue);
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));
    }
}
