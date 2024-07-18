import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        
        int years = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        int daysLeft = remainingDays % 7;
        
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + daysLeft);
        
        // Test cases
        int[] testCases = {38, 3, 0, -365, -45};
        for (int testDays : testCases) {
            System.out.println("Test Case - Enter the number of days: " + testDays);
            if (testDays < 0) {
                System.out.println("Invalid number of days");
                continue;
            }
            years = testDays / 365;
            remainingDays = testDays % 365;
            weeks = remainingDays / 7;
            daysLeft = remainingDays % 7;
            
            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + daysLeft);
        }
    }
}
