package chapter10_datetime;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Exercise10_3 {
    public static void main(String[] args) {
        String data = "123,456,789.5";

        try{
            DecimalFormat df = new DecimalFormat("#,###.##");
            DecimalFormat df2 = new DecimalFormat("#,####");
            Number num = df.parse(data);
            double data_to_double = num.doubleValue();

            System.out.println("data:"+data);
            System.out.println("반올림"+(int)(data_to_double+0.5));
            System.out.println("만단위"+df2.format(data_to_double));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
