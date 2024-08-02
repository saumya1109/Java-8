package DateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1=LocalTime.of(23,23);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(23,23,33);
        System.out.println(localTime2);

        LocalTime localTime3 = LocalTime.of(23,23,33,000223);
        System.out.println(localTime3);
        System.out.println();

        //Getting the values from local time instance
        System.out.println("get hour: "+ localTime.getHour());
        System.out.println("get minute"+ localTime.getMinute());
        System.out.println("clock hour of the day: "+ localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("Second of the day: "+ localTime.toSecondOfDay());

        //Modifying the time
        System.out.println("12 hours clock: "+localTime.minusHours(12));
        System.out.println("12 hours clock: "+localTime.minus(14, ChronoUnit.HOURS));
        System.out.println("Midnight: "+localTime.MIDNIGHT);
        System.out.println("Hour of the day: "+localTime.with(ChronoField.HOUR_OF_DAY,22));
        System.out.println("Add the time: "+localTime.plusHours(12));






    }


}
