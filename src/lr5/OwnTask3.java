package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class OwnTask3 {
    public static void main(String[] args) {
        List<String> list = List.of("Cat", "dog", "Shark", "snake", "turtle", "Humster");

        System.out.println("Original list: " + String.join(" ", list));

        System.out.println("Filtered list: " + String.join(" ", getUpperWords(list)));
    }

    public static List<String> getUpperWords(List<String> list) {
        return list.stream().filter(word -> Character.isUpperCase(word.charAt(0))).collect(Collectors.toList());
    }
}
