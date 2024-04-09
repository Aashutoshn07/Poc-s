import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeMain {
    public static void main(String[] args) {
        // Create a date-based event using LocalDate
        LocalDate dateEvent = LocalDate.of(2024, Month.APRIL, 15);
        System.out.println("Date-based event: " + dateEvent);

        // Create a time-based event using LocalTime
        LocalTime timeEvent = LocalTime.of(16, 30);
        System.out.println("Time-based event: " + timeEvent);

        // Combine date and time into a single LocalDateTime object
        LocalDateTime dateTimeEvent = LocalDateTime.of(dateEvent, timeEvent);
        System.out.println("Combined date-time event: " + dateTimeEvent);

        // Create an Instant object representing the current time
        Instant instantNow = Instant.now();
        System.out.println("Current instant: " + instantNow);

        // Calculate the period until the date-based event
        Period periodUntilEvent = Period.between(LocalDate.now(), dateEvent);
        System.out.println("Period until date-based event: " + periodUntilEvent);

        // Calculate the duration until the time-based event
        Duration durationUntilEvent = Duration.between(LocalDateTime.now(), dateTimeEvent);
        System.out.println("Duration until time-based event: " + durationUntilEvent);

        // Format the LocalDateTime object using a custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTimeEvent.format(formatter);
        System.out.println("Formatted date-time event: " + formattedDateTime);
    }
}
