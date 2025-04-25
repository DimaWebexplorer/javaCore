package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class OwnTask6 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30);
        int divisor = 10;

        List<Integer> filtered = filterByDivisor(numbers, divisor);
        System.out.println(filtered);
    }

    public static List<Integer> filterByDivisor(List<Integer> list, int divisor) {
        return list.stream().filter(num -> num % divisor == 0).collect(Collectors.toList());
    }
}
