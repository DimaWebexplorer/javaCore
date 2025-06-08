package timus;

import java.util.*;

public class Task2100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int totalGuests = 2;

        for (int i = 0; i < n; i++) {
            String response = scanner.nextLine();
            totalGuests++;

            if (response.contains("+one")) {
                totalGuests++;
            }
        }

        if (totalGuests == 13) {
            totalGuests++;
        }

        int totalCost = totalGuests * 100;

        System.out.println(totalCost);
    }
}
