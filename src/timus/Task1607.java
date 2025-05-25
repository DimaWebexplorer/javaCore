package timus;

import java.util.Scanner;

public class Task1607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int x = (c - a1) / (b + d);
        int a = a1 + b * x;
        c -= d * x;
        if (x < 0) {
            System.out.println(a1);
        } else if (a >= c) {
            System.out.println(a);
        } else if (a + b >= c) {
            System.out.println(c);
        } else if (a + b >= (c - d)) {
            System.out.println(a + b);
        }
    }
}
