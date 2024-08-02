package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2018,
                03,21,23,33,33,978);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 =LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime2);

        //Getting the time and date

        System.out.println("Get hour: "+ localDateTime.getHour());
        System.out.println("Get minute: "+localDateTime.getMinute());
        System.out.println("Get day of the month: "+ localDateTime.getDayOfMonth());
        System.out.println("Get day of the month: "+ localDateTime.get(ChronoField.DAY_OF_MONTH));

        //Modifying the values
        System.out.println("Adding hour: "+ localDateTime.plus(2, ChronoUnit.HOURS));
        System.out.println("Adding hour: "+ localDateTime.plusHours(2));
        System.out.println("Adding hour: "+ localDateTime.minusDays(2));

        //Converting time and date to localdatetime

        LocalDate localDate = LocalDate.of(2018,9,12);
        System.out.println(localDate.atTime(23,39));

        LocalTime localTime = LocalTime.of(23,39);
        System.out.println(localTime.atDate(localDate));

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println(localDateTime3.toLocalDate());
        System.out.println(localDateTime3.toLocalTime());



    }
}
