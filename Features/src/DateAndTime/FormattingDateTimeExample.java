package DateAndTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTimeExample {
    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();

    }

    public static void parseLocalDateTime() {
        String dateTime = "2018-04-18T09:33:34";
        LocalDateTime.parse(dateTime);
        System.out.println(dateTime);

        LocalDateTime parse1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(parse1);

        //Custom date time format
        String dateTime1 = "2018-04-18T09*33*34";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH*mm*ss");
        LocalDateTime parse2 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println(parse2);

        String dateTime2 = "2018-04-18abc09*33*34";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH*mm*ss");
        LocalDateTime parse3 = LocalDateTime.parse(dateTime2, dateTimeFormatter1);
        System.out.println(parse3);

        System.out.println();

    }

    public static void formatLocalDateTime() {
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH*mm*ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String convertedDateTime = localDateTime.format(dateTimeFormatter1);
        System.out.println(convertedDateTime);
    }
}
