package lr3;
import java.util.Map;
import java.util.TreeMap;

public class OwnTask5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");

        System.out.println("Строки с ключом > 5:");
        map.entrySet().stream()
                .filter(entry -> entry.getKey() > 5)
                .forEach(entry -> System.out.println(entry.getValue()));

        if (map.containsKey(0)) {
            System.out.println("Строки с ключом = 0: " + map.get(0));
        }

        int product = map.entrySet().stream()
                .filter(entry -> entry.getValue().length() > 5)
                .map(Map.Entry::getKey)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Произведение ключей, где длина строки > 5: " + product);
    }
}