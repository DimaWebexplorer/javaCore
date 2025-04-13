package lr4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Own2Task2 {
    private static void ReturnRow() {
        int [][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        for (int i : matrix[row]) {
            System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Матрица 4х4, введите строку для вывода");
        try {
            ReturnRow();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Нет такой строки");
        } catch (InputMismatchException ex) {
            System.out.println("Введено не целое число");
        }
    }
}
