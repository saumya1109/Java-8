package DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();

    }

    public static void parseLocalDate() {

        //String --> LocalDate
        String date = "2018-04-28";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate1);

        String date1 = "20180428"; //yyyyyMMdd
        LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(localDate2);

        //Custom Defined Date Format
        String date2="2018|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2,dateTimeFormatter);
        System.out.println(localDate3);

        String date3="2018*04*28";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4 = LocalDate.parse(date3,dateTimeFormatter1);
        System.out.println(localDate4);
        System.out.println();


    }

    public static void formatLocalDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String format = localDate.format(dateTimeFormatter);
        System.out.println(format);

    }
}
