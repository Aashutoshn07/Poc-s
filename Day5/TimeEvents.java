import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeEvents {
    public static void main(String[] args) {
        // Instant - Current timestamp
        Instant instant = Instant.now();
        System.out.println("Current instant: " + instant);

        // Period - Difference between two dates
        LocalDate startDate = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2024, Month.DECEMBER, 31);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period: " + period.getYears() + " years, " +
                period.getMonths() + " months, " +
                period.getDays() + " days");

        // Duration - Difference between two times
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(17, 0);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration: " + duration.toHours() + " hours, " +
                duration.toMinutes() + " minutes");

        // TemporalUnit - Adding hours to a date
        long hoursToAdd = 3;
        Duration durationToAdd = Duration.ofHours(hoursToAdd);
        System.out.println("Duration to add: " + durationToAdd);

        try {
            LocalDateTime date = LocalDateTime.now();
            System.out.println("current date-time"+date);
            LocalDateTime newDate = date.plus(durationToAdd);
            System.out.println("New date after adding duration: " +newDate);
            // System.out.println(newDate.format);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
