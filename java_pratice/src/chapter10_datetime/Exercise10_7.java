package chapter10_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Exercise10_7 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, 12, 1);
        ld = ld.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY));

        System.out.println(ld);
    }
}
