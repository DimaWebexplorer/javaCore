package timus;
import java.util.Scanner;
public class Task1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = parts[1].length();

        long result = n;

        for (int i = 1; n - i * k > 0; i++) {
            result *= (n - i * k);
        }

        System.out.println(result);
        scanner.close();
    }
}
