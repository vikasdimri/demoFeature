package example.demo.date;

import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateConversionMain {

    public static void main(String[] args) {

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now();

        System.out.println(deferenceInDatetime(date1, date2));
    }

    private static LocalDateTime timeToUTC(String date, ZoneId from) {
        if (!StringUtils.isEmpty(date) && from != null) {
            LocalDateTime ldt = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            ZonedDateTime fromZone = ldt.atZone(from);
            return fromZone.withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime();
        }
        return null;
    }

    private static LocalDateTime toLocalDateTime(String date) {
        if (!StringUtils.isEmpty(date)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return LocalDateTime.parse(date, formatter);
        }
        return null;
    }

    private static String deferenceInDatetime(LocalDateTime date1, LocalDateTime date2) {
        if (date1 != null && date2 != null) {
            if (date2.isAfter(date1)) {
                Duration duration = Duration.between(date1, date2);
                return String.valueOf(duration.toMinutes());
            } else {
                Duration duration = Duration.between(date2, date1);
                return String.valueOf(duration.toMinutes());
            }
        }
        return null;
    }
}
