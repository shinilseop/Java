package chapter10_datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");

        try{
            Date d1 = df.parse("20200101");
            Date d2 = df.parse("20200103");

            Calendar c1 = Calendar.getInstance();
            c1.setTime(d1);
            Calendar c2 = Calendar.getInstance();
            c1.setTime(d2);

            long c1Sec = c1.getTimeInMillis()/1000;
            long c2Sec = c2.getTimeInMillis()/1000;

            System.out.println(c1Sec);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
