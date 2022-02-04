package chapter10_datetime;

import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        DateFormat df2 = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");

        while (true) {
            System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.");
            String input = sc.nextLine();

            try {
                Date date = df.parse(input);

                System.out.println(df2.format(date));
                break;
            } catch (Exception e) {
//                e.printStackTrace();
                continue;
            }
        }
    }
}
