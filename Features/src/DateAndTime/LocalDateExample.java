package DateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1= LocalDate.of(2018,07,17);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018, 02);
        System.out.println(localDate2);
        System.out.println();


        //Get values from localDate
        System.out.println("Get month: "+ localDate.getMonth());
        System.out.println("Get month value: "+ localDate.getMonthValue());
        System.out.println("Get day of the week: "+ localDate.getDayOfWeek());
        System.out.println("Get day of the year: "+ localDate.getDayOfYear());
        System.out.println("Get day of the week: "+ localDate.get(ChronoField.DAY_OF_WEEK));
        System.out.println();

        //Modifying the local date

        //******This won't change the actual local date instance, the object is immutable****************

        System.out.println("Plus Days: "+ localDate.plusDays(2));
        System.out.println("Plus Months: "+ localDate.plusMonths(2));
        System.out.println("Minus Days: "+ localDate.minusDays(2));
        System.out.println("With Year: "+ localDate.withYear(2019));
        System.out.println("With ChronoField: "+ localDate.with(ChronoField.YEAR,2020));
        System.out.println("With TemporalAdjusters: "+ localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("minus using ChronoUnit: "+ localDate.minus(1, ChronoUnit.YEARS));
        System.out.println();


        //Additional Support Methods
         System.out.println("leapYear: "+ localDate.isLeapYear());
        System.out.println("leapYear: "+ LocalDate.of(2018,9,1).isLeapYear());
        System.out.println();

        //To check if two dates are equal ot not
        System.out.println("Equal: "+ localDate.isEqual(localDate1));
        System.out.println("After: "+ localDate.isAfter(localDate1));
        System.out.println("Before: "+ localDate.isBefore(localDate1));

        //Unsupported
      /*  System.out.println("minus using ChronoUnit: "+
                localDate.minus(1, ChronoUnit.MINUTES));
        <--- Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Minutes*/
        System.out.println();

        System.out.println("isSupported "+ localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("isSupported "+ localDate.isSupported(ChronoField.YEAR));



    }
}
