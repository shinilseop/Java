package chapter10_datetime;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            LocalDate ld = LocalDate.of(2010, i, 1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
//            System.out.println(ld.toString());

            Calendar calendar = Calendar.getInstance();
            calendar.set(ld.getYear(),ld.getMonthValue()-1,ld.getDayOfMonth());
            Date date = calendar.getTime();

            String pattern = "yyyy-MM-dd은 F번째 E요일입니다.";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);

            System.out.println(sdf.format(date));
        }
    }
}
