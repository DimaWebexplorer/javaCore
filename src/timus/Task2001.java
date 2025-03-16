package timus;
import java.util.Scanner;

public class Task2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w1 = scanner.nextInt();
        int z1 = scanner.nextInt();
        int w2 = scanner.nextInt();
        int z2 = scanner.nextInt();
        int w3 = scanner.nextInt();
        int z3 = scanner.nextInt();

        System.out.printf("%d %d", w1 - w3, z1 - z2);
    }
}
