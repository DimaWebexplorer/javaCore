package timus;

import java.util.Scanner;

public class Task1349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        boolean found = false;

        for (int a = 1; a <= 100; a++) {
            for (int b = a + 1; b <= 100; b++) {
                for (int c = b + 1; c <= 100; c++) {
                    if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                        System.out.println(a + " " + b + " " + c);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (found) break;
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}
