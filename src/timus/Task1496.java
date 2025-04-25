package timus;

import java.util.*;

public class Task1496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> submissions = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String team = scanner.nextLine();
            submissions.put(team, submissions.getOrDefault(team, 0) + 1);
        }

        List<String> spammers = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : submissions.entrySet()) {
            if (entry.getValue() > 1) {
                spammers.add(entry.getKey());
            }
        }

        for (String spammer : spammers) {
            System.out.println(spammer);
        }
    }
}
