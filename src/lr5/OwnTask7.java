package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class OwnTask7 {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "kiwi", "cherry", "pear");
        int minLength = 5;

        List<String> filtered = filterByLength(strings, minLength);
        System.out.println(filtered);
    }

    public static List<String> filterByLength(List<String> list, int minLength) {
        return list.stream().filter(str -> str.length() > minLength).collect(Collectors.toList());
    }
}
