package DateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.util.stream.Collectors.groupingBy;

public class TimeZoneExample {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);              //2024-08-01T18:18:22.657838700-04:00[America/New_York]
        System.out.println(zonedDateTime.getZone());   //--> America/New_York
        System.out.println(zonedDateTime.getOffset()); // -04:00
        System.out.println();

        System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));


        ZoneId.getAvailableZoneIds().stream().forEach(zone -> System.out.println(zone));

        // convert localdatetime to zonedLocalDate


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.atZone(ZoneId.of("America/Chicago")));


    }
}
