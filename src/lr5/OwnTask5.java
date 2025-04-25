package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class OwnTask5 {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry", "apricot", "grape");
        String substring = "ap";

        List<String> filtered = filterBySubstring(strings, substring);
        System.out.println(filtered);
    }

    public static List<String> filterBySubstring(List<String> list, String substring) {
        return list.stream().filter(str -> str.contains(substring)).collect(Collectors.toList());
    }
}
