package example.demo.mix;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateMain {

    public static void main(String[] args) {

        String date = "2021-03-22 08:11:03";
        System.out.println("Result :: "+isWithinDateRange(date));
        System.out.println("Key :: "+getCompositeKey());
    }

    public static boolean timeWindow(Instant instant) {
        //4-6 8-10 12-14 16-18 20-22 24-2
        int hour = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).getHour();
        int minute = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).getMinute();

        System.out.println("Time ->" + hour + ":" + minute);
        if (((hour >= 4 && hour < 6)
                || (hour >= 8 && hour < 10)
                || (hour >= 12 && hour < 14)
                || (hour >= 16 && hour < 18)
                || (hour >= 20 && hour < 22)
                || (hour >= 24 && hour < 2))
                && (minute > 10 && minute < 50)) {
            return true;
        }
        return false;
    }

    public void printTime() {
        Instant instant = Instant.now();
        //System.out.println("now :" + instant.get(ChronoField.HOUR_OF_DAY));


        // get overall time
        LocalTime time = instant.atZone(ZoneOffset.UTC).toLocalTime();

        System.out.println("time : " + time);
        // get hour
        int hour = instant.atZone(ZoneOffset.UTC).getHour();
        System.out.println("hour : " + hour);
        // get minute
        int minute = instant.atZone(ZoneOffset.UTC).getMinute();
        System.out.println("minute :" + minute);
        // get second
        int second = instant.atZone(ZoneOffset.UTC).getSecond();
        System.out.println("second : " + second);
        // get nano
        int nano = instant.atZone(ZoneOffset.UTC).getNano();


        LocalDateTime ldt1 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        //LocalDateTime ldt2 = LocalDateTime.ofInstant(dt2, ZoneId.systemDefault());

        /*ldt1 = ldt1
                .withHour(ldt2.getHour())
                .withMinute(ldt2.getMinute())
                .withSecond(ldt2.getSecond());

        dt1 = ldt1.atZone(ZoneId.systemDefault()).toInstant();*/
        System.out.println(ldt1.getHour());
    }

    public static boolean isWithinDateRange(String date) {
        String inputPattern = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(inputPattern);
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        return localDateTime.isAfter(LocalDateTime.now().minusMonths(6));
    }

    private static String getCompositeKey() {

            String serialNum = "MM10065";
            String plantId = "21";
            String campaignId = "574321";
            String goodTimestamp = null;
            String badTimestamp = null;
            String qlsUnitId = "82338321";
            String operation = "INSERT";

            String compositeKey = serialNum + plantId + campaignId + goodTimestamp + badTimestamp + qlsUnitId + operation;
            return compositeKey;

    }
}
