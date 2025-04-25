package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class OwnTask9 {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "123", "hello!", "world", "java8");

        List<String> filtered = filterOnlyLetters(strings);
        System.out.println(filtered); // Вывод: [apple, world]
    }

    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream().filter(str -> str.matches("[a-zA-Z]+")).collect(Collectors.toList());
    }
}
