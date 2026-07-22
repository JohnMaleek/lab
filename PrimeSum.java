package javaApp;

public class PrimeSum {

    // Calculates the sum of prime numbers up to maxNum
    public static int primesum(int maxNum) {
        if (maxNum <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 2; i <= maxNum; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int maxNum = 20;
        if (args != null && args.length > 0) {
            try {
                maxNum = Integer.parseInt(args[0]);
            } catch (Exception e) {
                maxNum = 20;
            }
        }
        int sum = primesum(maxNum);
        System.out.println(sum);
    }
}
