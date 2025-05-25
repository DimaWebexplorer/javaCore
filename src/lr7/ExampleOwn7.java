package lr7;

import lr7.test_files.Person;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ExampleOwn7 {
    public static void main(String[] args) {
        Person person = new Person("Dima", 314);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter output file name:");
        String file_output = scanner.nextLine();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file_output);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

            out.writeObject(person);
            out.close();
            fileOutputStream.close();

            System.out.println("Serializable data was saved: " + file_output);
        } catch (IOException e) {
            System.out.println("Data writing/serializable exception:" + e.getMessage());
        }
    }
}
