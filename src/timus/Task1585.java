package timus;
import java.util.Scanner;

public class Task1585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_Emperor_Penguin = 0;
        int num_Macaroni_Penguin = 0;
        int num_Little_Penguin = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            switch (scanner.nextLine()) {
                case "Emperor Penguin":
                    num_Emperor_Penguin++;
                    break;
                case "Macaroni Penguin":
                    num_Macaroni_Penguin++;
                    break;
                case "Little Penguin":
                    num_Little_Penguin++;
                    break;
            }
        }
        if (num_Little_Penguin > num_Macaroni_Penguin && num_Little_Penguin > num_Emperor_Penguin){
            System.out.println("Little Penguin");
        } else if (num_Macaroni_Penguin > num_Little_Penguin && num_Macaroni_Penguin > num_Emperor_Penguin){
            System.out.println("Macaroni Penguin");
        } else {
            System.out.println("Emperor Penguin");
        }
    }
}
