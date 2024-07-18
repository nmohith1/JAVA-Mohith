class CompositeNumbers {
    public static void main(String[] args) {
        int A = 12;
        int B = 19;
        
        System.out.print("Composite numbers between " + A + " and " + B + " are: ");
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is composite
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not composite numbers
        }
        boolean hasDivisors = false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                hasDivisors = true;
                break;
            }
        }
        return hasDivisors;
    }
}
