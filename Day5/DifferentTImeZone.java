import java.time.*;
import java.time.format.DateTimeFormatter;

public class DifferentTImeZone {
    public static void main(String[] args) {
        // Working with timezones
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkTime = ZonedDateTime.now(newYorkZone);
        System.out.println("Current time in New York: " + newYorkTime);

        // Managing daylight savings changes
        LocalDateTime dateTime = LocalDateTime.of(2024, Month.MARCH, 10, 2, 30);
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZonedDateTime londonTime = ZonedDateTime.of(dateTime, londonZone);
        System.out.println("London time on March 10, 2024: " + londonTime);

        // Formatting date and time values
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted date-time: " + formattedDateTime);
    }
}
