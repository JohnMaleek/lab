package javaApp;

public class EvenSum {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int even[] = new int[num];
        int sum = 0, j = 0;
        String evennums = "";

        // Insert your code here
        for (int i = 2; i <= num; i += 2) {
            even[j] = i;
            sum = sum + i;
            j++;
        }

        for (int i = 0; i < j; i++) {
            evennums = evennums + even[i];
            if (i < j - 1) {
                evennums = evennums + ",";
            }
        }

        System.out.println(evennums);
        System.out.println(sum);
    }
}
