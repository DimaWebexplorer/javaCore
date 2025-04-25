package lr5;

import java.util.Random;
import java.util.Arrays;

public class OwnTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = random.ints(10, -100, 100).toArray();
        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.println("Filtered array: " + Arrays.toString(getEvenArray(arr)));
    }

    public static int[] getEvenArray(int[] arr) {
        return Arrays.stream(arr).filter(num -> num % 2 == 0).toArray();
    }
}
