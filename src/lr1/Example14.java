package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int previous = number - 1;
        int next = number + 1;
        int sum = previous + number + next;
        int squareOfSum = sum * sum;

        System.out.println("Последовательность: " + previous + ", " + number + ", " + next + ", " + squareOfSum);
        scanner.close();
    }
}