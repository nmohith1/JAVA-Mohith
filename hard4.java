import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int number = scanner.nextInt();
        System.out.print("N: ");
        int n = scanner.nextInt();
        
        if (number <= 0 || n < 0) {
            System.out.println("Invalid input");
            return;
        }

        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        System.out.println("Number of factors = " + factors.size());
        if (n > 0 && n <= factors.size()) {
            System.out.println(n + "th factor of " + number + " = " + factors.get(n - 1));
        } else {
            System.out.println(n + "th factor is not available");
        }
        
        // Test cases
        int[] testNumbers = {512, 343, 1024, -6561, 0};
        int[] testN = {6, 7, 0, 3, 2};
        
        for (int i = 0; i < testNumbers.length; i++) {
            int testNumber = testNumbers[i];
            int nthFactor = testN[i];
            System.out.println("Test Case - Given Number: " + testNumber + ", N: " + nthFactor);
            if (testNumber <= 0 || nthFactor < 0) {
                System.out.println("Invalid input");
                continue;
            }
            factors.clear();
            for (int j = 1; j <= testNumber; j++) {
                if (testNumber % j == 0) {
                    factors.add(j);
                }
            }
            System.out.println("Number of factors = " + factors.size());
            if (nthFactor > 0 && nthFactor <= factors.size()) {
                System.out.println(nthFactor + "th factor of " + testNumber + " = " + factors.get(nthFactor - 1));
            } else {
                System.out.println(nthFactor + "th factor is not available");
            }
        }
    }
}
