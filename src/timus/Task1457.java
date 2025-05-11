package timus;

import java.util.Scanner;

public class Task1457 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            positions[i] = scanner.nextInt();
        }

        double left = 0;
        double right = 1_000_000;

        while (right - left > 1e-7) {
            double mid1 = left + (right - left) / 3;
            double mid2 = right - (right - left) / 3;

            if (calculateEffort(mid1, positions) < calculateEffort(mid2, positions)) {
                right = mid2;
            } else {
                left = mid1;
            }
        }

        System.out.printf("%.6f%n", left);
    }

    private static double calculateEffort(double point, int[] positions) {
        double effort = 0;
        for (int pos : positions) {
            double distance = point - pos;
            effort += distance * distance;
        }
        return effort;
    }
}