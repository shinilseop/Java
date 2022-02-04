package chapter10_datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise10_8 {
    public static void main(String[] args) {
        ZoneId zid_kor = ZoneId.of("Asia/Seoul");
        ZonedDateTime zdt_kor = ZonedDateTime.now().withZoneSameInstant(zid_kor);
        ZoneId zid_ny = ZoneId.of("America/New_York");
        ZonedDateTime zdt_amc = ZonedDateTime.now().withZoneSameInstant(zid_ny);

        long secKR = zdt_kor.getOffset().getTotalSeconds();
        long secNY = zdt_amc.getOffset().getTotalSeconds();
        long diffHour = (secKR-secNY)/3600;

        System.out.println("sec1="+secKR);
        System.out.println("sec2="+secNY);
        System.out.println("diff="+diffHour+" hrs\n");
    }
}
