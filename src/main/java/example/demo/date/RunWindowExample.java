package example.demo.date;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

@Slf4j
public class RunWindowExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        //log.info("{} : {}", localDateTime, isRunWindowAvailableForHive());

        localDateTime = LocalDateTime.parse("2018-12-30T17:45:00.00");
        System.out.println(localDateTime+" : "+isRunWindowAvailableForHive(localDateTime));
        localDateTime = LocalDateTime.parse("2018-12-30T20:45:00.00");
        System.out.println(localDateTime+" : "+isRunWindowAvailableForHive(localDateTime));
        localDateTime = LocalDateTime.parse("2018-12-30T21:10:00.00");
        System.out.println(localDateTime+" : "+isRunWindowAvailableForHive(localDateTime));


    }

    public static boolean isRunWindowAvailableForHive(LocalDateTime localDateTime) {
        //0-2 4-6 8-10 12-14 16-18 20-22 24-2
       // LocalDateTime localDateTime = LocalDateTime.now();
        AtomicBoolean flag = new AtomicBoolean(false);
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        Arrays.stream(new int[]{0, 1, 2, 4, 5, 6, 8, 9, 10, 12, 13, 14, 16, 17, 18, 20, 21, 22}).filter(n -> n == hour)
                .forEach(e -> {
                    if (Arrays.stream(new int[]{1, 5, 9, 13, 17, 21}).anyMatch(ch -> ch == hour)) {
                        flag.set(true);
                    } else {
                        if (Arrays.stream(new int[]{0, 4, 8, 12, 16, 20}).anyMatch(up -> up == hour) && minute > 10) {
                            flag.set(true);
                        } else if (Arrays.stream(new int[]{1, 5, 9, 13, 17, 21}).anyMatch(lo -> lo == hour) && minute < 50) {
                            flag.set(true);
                        } else {
                            flag.set(false);
                        }
                    }
                });
        return flag.get();
    }


    public static boolean isSchedulerRunTime(LocalDateTime localDateTime, String scheduleTime) {

        //LocalDateTime localDateTime = LocalDateTime.now();
        String[] scheduleTimeArray = Arrays.stream(scheduleTime.split(",")).map(String::trim).toArray(String[]::new);
        boolean runScheduler = Arrays.stream(scheduleTimeArray).anyMatch(e -> {
            int currentHour = localDateTime.getHour();
            int currentMinute = localDateTime.getMinute();
            String[] split = e.split(":");
            int hour = Integer.valueOf(split[0]);
            int minute = split.length > 1 ? Integer.valueOf(split[1]) : 0;
            if (currentHour == hour && currentMinute > minute) {
                return true;
            }
            return false;
        });
        return runScheduler;
    }
}
