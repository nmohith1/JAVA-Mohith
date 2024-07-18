import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        int count = 0, num = 1, i;
        List<Integer> primes = new ArrayList<>();

        while (count < n + n) {
            num++;
            boolean isPrime = true;
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(num);
                count++;
            }
        }

        System.out.println(n + "th Prime number is " + primes.get(n - 1));
        System.out.print(n + " prime numbers after " + primes.get(n - 1) + " are: ");
        for (i = n; i < 2 * n; i++) {
            System.out.print(primes.get(i) + (i == 2 * n - 1 ? "" : ", "));
        }
        System.out.println();
        
        // Test cases
        int[] testCases = {1, 0, -4, 11, 7};
        for (int testN : testCases) {
            System.out.println("Test Case - N: " + testN);
            if (testN <= 0) {
                System.out.println("Invalid input");
                continue;
            }
            count = 0;
            num = 1;
            primes.clear();
            while (count < testN + testN) {
                num++;
                boolean isPrime = true;
                for (i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primes.add(num);
                    count++;
                }
            }
            System.out.println(testN + "th Prime number is " + primes.get(testN - 1));
            System.out.print(testN + " prime numbers after " + primes.get(testN - 1) + " are: ");
            for (i = testN; i < 
