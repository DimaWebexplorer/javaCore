package timus;
import java.util.Scanner;

public class Task2066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Math.min(a - b - c, a - b * c));
    }
}
