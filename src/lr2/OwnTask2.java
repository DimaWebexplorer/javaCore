package lr2;
import java.util.Scanner;

public class OwnTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину и высоту массива через пробел: ");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.close();
        int [][] array = new int[width][height];

        int currentNum = 1;

        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < width; j++) {
                    array[j][i] = currentNum;
                    currentNum++;
                }
            } else {
                for (int j = width - 1; j >= 0; j--) {
                    array[j][i] = currentNum;
                    currentNum++;
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
