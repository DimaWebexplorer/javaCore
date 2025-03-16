package timus;
import java.util.Scanner;

public class Task1209 {
    public static int WhichNumber(long n) {
        double res = (-1 + Math.sqrt(1 + 8 * (n - 1))) / 2;
        if (res < -1) {
            return 0;
        }

        if (Math.ceil(res) - res == 0.0) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n ; i++) {
            System.out.printf("%d ", WhichNumber(scanner.nextInt()));
        }
    }
}
