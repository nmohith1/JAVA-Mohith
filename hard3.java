import java.util.Scanner;

public class CollegeUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Total Users: ");
        int totalUsers = scanner.nextInt();
        System.out.print("Staff Users: ");
        int staffUsers = scanner.nextInt();
        
        if (totalUsers < 0 || staffUsers < 0) {
            System.out.println("Invalid input");
            return;
        }

        int nonTeachingStaff = staffUsers / 3;
        int studentUsers = totalUsers - staffUsers - nonTeachingStaff;

        if (studentUsers < 0) {
            System.out.println("Invalid input: Student users cannot be negative");
        } else {
            System.out.println("Student Users: " + studentUsers);
        }
        
        // Test cases
        int[] totalUsersTestCases = {0, -143, 1026, 450, 600};
        int[] staffUsersTestCases = {0, 0, 1026, 540, 450};
        
        for (int i = 0; i < totalUsersTestCases.length; i++) {
            int total = totalUsersTestCases[i];
            int staff = staffUsersTestCases[i];
            
            System.out.println("Test Case - Total Users: " + total + ", Staff Users: " + staff);
            if (total < 0 || staff < 0) {
                System.out.println("Invalid input");
                continue;
            }
            nonTeachingStaff = staff / 3;
            studentUsers = total - staff - nonTeachingStaff;
            
            if (studentUsers < 0) {
                System.out.println("Invalid input: Student users cannot be negative");
            } else {
                System.out.println("Student Users: " + studentUsers);
            }
        }
    }
}
