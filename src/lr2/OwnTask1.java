package lr2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class OwnTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть больше 0.");
            scanner.close();
            return;
        }

        int[] array = new int[size];

        Arrays.setAll(array, i -> random.nextInt(100));

        System.out.println("Полученный массив: " + Arrays.toString(array));

        int minValue = array[0];
        ArrayList<Integer> minIndexes = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndexes.clear();
                minIndexes.add(i);
            } else if (array[i] == minValue) {
                minIndexes.add(i);
            }
        }

        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Индексы минимального значения: " + minIndexes);

        scanner.close();
    }
}
