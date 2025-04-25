package lr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.print(integers.get(i));
        }

        List<Integer> integersAfter = squareList(integers);

        System.out.println("\n" + "Список после возведения в квадрат: " + "\n");

        for (Integer i : integersAfter) {
            System.out.print(i);
        }
    }

    public static List<Integer> squareList(List<Integer> list) {
        return list.stream().map(i -> i * i).collect(Collectors.toList());
    }
}
