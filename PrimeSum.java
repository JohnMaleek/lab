package javaApp;

public class PrimeSum {

    // Method expected by PrimeSumTest.java
    public static int primesum(int maxNum) {
        if (maxNum <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 2; i <= maxNum; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int maxNum = Integer.parseInt(args[0]);
            System.out.println(primesum(maxNum));
        }
    }
}
