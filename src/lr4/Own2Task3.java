package lr4;

import java.util.Scanner;

public class Own2Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");

        try {
            int n = Integer.parseInt(scanner.nextLine());
            byte[] array = new byte[n];
            System.out.println("Введите элементы массива:");

            for (int i = 0; i < n; i++) {
                try {
                    array[i] = Byte.parseByte(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введено не числовое значение. Пожалуйста, введите число типа byte.");
                    i--;
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                    i--;
                }
            }

            int sum = 0;
            for (byte b : array) {
                sum += b;
            }

            System.out.println("Сумма элементов массива: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не числовое значение для размера массива.");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}