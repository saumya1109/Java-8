package DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
    public static void main(String[] args) {

        //java.util.date to Localdate
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);

        Date date1 = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date1);
        System.out.println();


        //java.sql.date to Localdate

        java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
        System.out.println(sqlDate);

        LocalDate localDate1 = sqlDate.toLocalDate();
        System.out.println(localDate1);
    }
}
