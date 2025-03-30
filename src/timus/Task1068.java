package timus;
import java.util.Scanner;

public class Task1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = (1 + Math.abs(n)) * Math.abs(n) / 2;
        if (n <= 0) {
            sum *= -1;
            sum++;
        }
        System.out.println(sum);
    }
}
