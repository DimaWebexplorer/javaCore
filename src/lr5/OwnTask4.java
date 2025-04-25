package lr5;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OwnTask4 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        random.ints(10, -100, 100).forEach(num -> list.add(num));
        System.out.println("Original list: " + list);

        System.out.println("Squared list: " + getSquared(list));
    }

    public static List<Integer> getSquared(List<Integer> list) {
        return list.stream().map(num -> num * num).collect(Collectors.toList());
    }
}
