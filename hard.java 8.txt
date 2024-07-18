import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DayOfWeekCalculator {
    public static String getDayOfWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().getDisplayName(DateTimeFormatter.ofPattern("EEEE"), Locale.ENGLISH);
    }

    public static void main(String[] args) {
        // Sample inputs
        System.out.println(getDayOfWeek(31, 8, 2019)); // Output: "Saturday"
        System.out.println(getDayOfWeek(18, 7, 1999)); // Output: "Sunday"
        System.out.println(getDayOfWeek(15, 8, 1993)); // Output: "Sunday"

        // Test cases
        System.out.println(getDayOfWeek(1, 1, 2000));  // Output: "Saturday"
        System.out.println(getDayOfWeek(29, 2, 2020)); // Output: "Saturday"
    }
}
