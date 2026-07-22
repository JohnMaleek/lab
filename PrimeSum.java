package javaApp;

public class PrimeSum {

    public static void main(String[] args) {
        int maxNum = 0;
        
        if (args.length > 0) {
            maxNum = Integer.parseInt(args[0]);
        }

        int sum = 0;

        if (maxNum > 0) {
            for (int i = 2; i <= maxNum; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
        }

        // Print the sum (or 0 if maxNum <= 0)
        System.out.println(sum);
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
}
