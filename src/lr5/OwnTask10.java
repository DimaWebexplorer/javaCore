package lr5;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OwnTask10 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        random.ints(10, -100, 100).forEach(num -> list.add(num));
        System.out.println("Original list: " + list);

        System.out.println("Filtered list: " + getLessThen(list, 20));
    }

    public static List<Integer> getLessThen(List<Integer> list, int ref) {
        return list.stream().filter(num -> num < ref).collect(Collectors.toList());
    }
}
