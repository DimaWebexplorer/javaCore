package timus;

import java.util.*;

public class Task1446 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> facultyMap = new LinkedHashMap<>();
        facultyMap.put("Slytherin", new ArrayList<>());
        facultyMap.put("Hufflepuff", new ArrayList<>());
        facultyMap.put("Gryffindor", new ArrayList<>());
        facultyMap.put("Ravenclaw", new ArrayList<>());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String faculty = scanner.nextLine();
            facultyMap.get(faculty).add(name);
        }

        for (Map.Entry<String, List<String>> entry : facultyMap.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (String student : entry.getValue()) {
                System.out.println(student);
            }
            System.out.println();
        }
    }
}
