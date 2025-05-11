package timus;

import java.util.Scanner;

public class Task1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int[] weights = new int[n];
        String[] inputWeights = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(inputWeights[i]);
        }

        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }

        int minDifference = Integer.MAX_VALUE;

        for (int subset = 0; subset < (1 << n); subset++) {
            int pile1Weight = 0;
            for (int i = 0; i < n; i++) {
                if ((subset & (1 << i)) != 0) {
                    pile1Weight += weights[i];
                }
            }
            int pile2Weight = totalWeight - pile1Weight;
            minDifference = Math.min(minDifference, Math.abs(pile1Weight - pile2Weight));
        }

        System.out.println(minDifference);
    }
}