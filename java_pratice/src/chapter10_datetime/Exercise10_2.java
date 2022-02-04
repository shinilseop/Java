package chapter10_datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_2 {
    static int paycheckCount(Calendar from, Calendar to) {
        if (from == null || to == null) {
            return 0;
        }

        long fromSec = from.getTimeInMillis()/1000;
        long toSec = to.getTimeInMillis()/1000;
        long diffSec = (fromSec - toSec);

        if (fromSec==toSec && to.get(Calendar.DAY_OF_MONTH) == 21) {
            return 1;
        }

        int monDiff = (12 * (to.get(Calendar.YEAR) - from.get(Calendar.YEAR)) - from.get(Calendar.MONTH) + to.get(Calendar.MONTH));

        if (monDiff < 0) {
            return 0;
        }

        if ((from.get(Calendar.DAY_OF_MONTH) <= 21) && (21 <= to.get(Calendar.DAY_OF_MONTH))) {
            monDiff++;
        }

        if ((from.get(Calendar.DAY_OF_MONTH) > 21) && (21 > to.get(Calendar.DAY_OF_MONTH))) {
            monDiff--;
        }

        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate = to.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(sdf.format(fromDate)+" ~ "
                +sdf.format(toDate)+":");
        System.out.println(paycheckCount(from, to));
    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();
        fromCal.set(2010,0,1);
        toCal.set(2010,0,1);
        printResult(fromCal, toCal);
        fromCal.set(2010,0,21);
        toCal.set(2010,0,21);
        printResult(fromCal, toCal);
        fromCal.set(2010,0,1);
        toCal.set(2010,2,1);
        printResult(fromCal, toCal);
        fromCal.set(2010,0,1);
        toCal.set(2010,2,23);
        printResult(fromCal, toCal);
        fromCal.set(2010,0,23);
        toCal.set(2010,2,21);
        printResult(fromCal, toCal);
        fromCal.set(2011,0,22);
        toCal.set(2010,2,21);
        printResult(fromCal, toCal);
    }

}
