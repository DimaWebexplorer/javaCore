package lr5;

import java.util.Random;
import java.util.Arrays;

public class OwnTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = random.ints(20, -100, 100).toArray();
        int[] arr2 = random.ints(30, -100, 100).toArray();
        System.out.println("Original array1: " + Arrays.toString(arr1));
        System.out.println("Original array2: " + Arrays.toString(arr2));

        System.out.println("Filtered array: " + Arrays.toString(getSimilarArray(arr1, arr2)));
    }

    public static int[] getSimilarArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).filter(num -> Arrays.stream(arr2).anyMatch(num2 -> num == num2)).toArray();
    }
}
