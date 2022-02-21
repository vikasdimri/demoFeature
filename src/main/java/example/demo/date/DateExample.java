package example.demo.date;

import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateExample {

    public static void main(String[] args) throws ParseException {
        String date2 = "2021-01-24T19:30:22";
        String date1 = "2021-01-24T18:00:22";
        System.out.println("Difference :: " + deferenceInDatetime(date1, date2));

        date2 = "2021-03-18T02:22:31";
        date1 = "2021-03-18T08:35:32";
        System.out.println(deferenceInDatetime(date1, date2));

        /*date2 = "2021-04-24 20:02:50.8270000";
        date1 = "2021-04-24 23:25:14";
        System.out.println(defferenceInDatetime(date1, date2));

        date2 = "2021-04-24 23:25:14.8270000";
        date1 = "2021-04-24 20:02:50";
        System.out.println(defferenceInDatetime(date1, date2));

        date2 = "2021-04-24 23:25:14.8270000";
        date1 = null;
        System.out.println(defferenceInDatetime(date1, date2));

        date1 = "2021-04-24 23:25:14.8270000";
        date2 = null;
        System.out.println(defferenceInDatetime(date1, date2));

        date2 = null;
        date1 = null;
        System.out.println(defferenceInDatetime(date1, date2));

        date2 = "2021-04-24 23:25:14.8270000";
        date1 = "";
        System.out.println(defferenceInDatetime(date1, date2));

        date2 = "";
        date1 = "";
        System.out.println(defferenceInDatetime(date1, date2));

        date2 = "";
        date1 = "2021-04-24 23:25:14.8270000";
        System.out.println(defferenceInDatetime(date1, date2));

        date2 = "abcd";
        date1 = "xyz";
        System.out.println(defferenceInDatetime(date1, date2));*/
    }


    private static String deferenceInDatetime(String strDate1, String strDate2) {
        if (!StringUtils.isEmpty(strDate1) && !StringUtils.isEmpty(strDate2)) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                Date date1 = sdf.parse(strDate1);
                Date date2 = sdf.parse(strDate2);

                if (date1.after(date2)) {
                    long diffInMillies = date1.getTime() - date2.getTime();
                    return String.valueOf(TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS));
                } else {
                    long diffInMillies = date2.getTime() - date1.getTime();
                    return String.valueOf(TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS));
                }
            } catch (StringIndexOutOfBoundsException | ParseException e) {
                throw new StringIndexOutOfBoundsException
                        ("One of the Date(" + strDate1 + ", " + strDate2 + ") is not in correct format.");
            }
        }
        return null;
    }

    private static String deferenceInDatetime2(String date1, String date2) {
        if (!StringUtils.isEmpty(date1) && !StringUtils.isEmpty(date2)) {
            try {
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
                LocalDateTime localDateTime1 = LocalDateTime.parse(date1.substring(0, 19), dateTimeFormatter);
                LocalDateTime localDateTime2 = LocalDateTime.parse(date2.substring(0, 19), dateTimeFormatter);
                if (localDateTime1.isAfter(localDateTime2)) {
                    return String.valueOf(Duration.between(localDateTime2, localDateTime1).toMinutes());
                } else {
                    return String.valueOf(Duration.between(localDateTime1, localDateTime2).toMinutes());
                }
            } catch (StringIndexOutOfBoundsException e) {
                throw new StringIndexOutOfBoundsException
                        ("One of the Date(" + date1 + ", " + date2 + ") is not in correct format.");
            }
        }
        return null;
    }

    private static String deferenceInDatetime3(String date1, String date2) {
        if (!StringUtils.isEmpty(date1) && !StringUtils.isEmpty(date2)) {
            try {
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-ddTHH:mm:ss");
                LocalDateTime localDateTime1 = LocalDateTime.parse(date1.substring(0, 19), dateTimeFormatter);
                LocalDateTime localDateTime2 = LocalDateTime.parse(date2.substring(0, 19), dateTimeFormatter);
                if (localDateTime1.isAfter(localDateTime2)) {
                    return String.valueOf(Duration.between(localDateTime2, localDateTime1).toMinutes());
                } else {
                    return String.valueOf(Duration.between(localDateTime1, localDateTime2).toMinutes());
                }
            } catch (StringIndexOutOfBoundsException e) {
                throw new StringIndexOutOfBoundsException
                        ("One of the Date(" + date1 + ", " + date2 + ") is not in correct format.");
            }
        }
        return null;
    }
}
