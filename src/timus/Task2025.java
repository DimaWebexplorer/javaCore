package timus;

import java.util.Scanner;

public class Task2025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int baseSize = n / k;
            int remainder = n % k;
            long sameFights = 0;

            sameFights += (k - remainder) * (baseSize * (baseSize - 1) / 2);

            sameFights += remainder * ((baseSize + 1) * baseSize / 2);

            long totalFights = (long)n * (n - 1) / 2 - sameFights;

            System.out.println(totalFights);
        }
    }
}
