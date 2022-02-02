package chapter9_lang_utils;

import java.util.Scanner;

public class Exercise9_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] split = input.split(" ");

        for (int i = Integer.parseInt(split[0]); i <= Integer.parseInt(split[1]); i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println();
        }
    }
}
