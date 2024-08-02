package DateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {

        LocalTime localTime1=LocalTime.of(7,20);
        LocalTime localTime2=LocalTime.of(8,20);

        long diff=localTime1.until(localTime2, ChronoUnit.MINUTES);
        System.out.println(diff);

        Duration between = Duration.between(localTime1, localTime2);
        System.out.println(between.toMinutes());
    }
}
