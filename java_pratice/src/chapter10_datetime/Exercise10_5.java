package chapter10_datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_5 {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");

        try{
            Date d1 = df.parse(yyyymmdd1);
            Date d2 = df.parse(yyyymmdd2);
//            System.out.println(d1);
//            System.out.println(d2);

            Calendar c1 = Calendar.getInstance();
            c1.setTime(d1);
            Calendar c2 = Calendar.getInstance();
            c2.setTime(d2);
//            System.out.println(c1);
//            System.out.println(c2);

            long c1Day = c1.getTimeInMillis()/(1000*60*60*24);
            long c2Day = c2.getTimeInMillis()/(1000*60*60*24);
//            System.out.println(c1Day);
//            System.out.println(c2Day);

            return (int)(c1Day-c2Day);
        } catch (ParseException e) {
            return 0;
        }
    }

    public static void main(String[] args){
        System.out.println(getDayDiff("20010103","20010101"));
        System.out.println(getDayDiff("20010103","20010103"));
        System.out.println(getDayDiff("20010103","200103"));
    }
}
