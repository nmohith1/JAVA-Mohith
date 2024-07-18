class NumberOfFactors {
    public static void main(String[] args) {
        int givenNumber = 100;
        int count = 0;

        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                count++;
            }
        }

        System.out.println("Number of factors = " + count);
    }
}
