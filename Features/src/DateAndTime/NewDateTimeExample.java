package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

    /*
    * java.time package in Java 8, which was heavily inspired by Joda-Time
     * */
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.minusHours(12));

        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);

    }
}
