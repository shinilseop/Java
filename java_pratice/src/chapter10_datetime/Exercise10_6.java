package chapter10_datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercise10_6 {
    public static void main(String[] args) {
        String birthDay = "2000-01-01";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");


        try{
            Calendar birthCal = Calendar.getInstance();
            birthCal.setTime(df.parse(birthDay));
            Calendar today = Calendar.getInstance();

            long birthSec = birthCal.getTimeInMillis()/1000;
            long todaySec = today.getTimeInMillis()/1000;

//            LocalDate birthDay = LocalDate.of(2000, 1, 1); // 자신의 생일을 지정
//            LocalDate now = LocalDate.now();
//            long days = birthDay.until(now, ChronoUnit.DAYS);

            System.out.println("birth day="+birthDay);
            System.out.println("today    ="+df.format(today.getTime()));
            System.out.println(((todaySec/(60*60*24))-(birthSec/(60*60*24)))+" days");
        } catch (ParseException e) {
//            e.printStackTrace();
        }

    }
}
