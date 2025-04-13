package lr4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Own2Task1 {
    private static double InputArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        int positiveNum = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num >= 0) {
                sum += num;
                positiveNum++;
            }
        }

        return sum / positiveNum;
    }

    public static void main(String[] args) {
        try {
            InputArray();
        } catch (ArithmeticException ex) {
            System.out.println("Нет положительных");
        } catch (InputMismatchException ex) {
            System.out.println("Введено не целое число");
        }
    }
}