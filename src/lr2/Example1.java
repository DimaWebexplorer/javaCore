package lr2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        System.out.println("Размер массива равен: " + size);

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(200);
            System.out.println("Элемент массива " + i + "= " + array[i]);
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Произведена сортировка массива");

        for (int i = 0; i < size; i++) {
            System.out.println("Элемент массива " + i + "после сортировки" + array[i]);
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(array));

        scanner.close();
    }
}
