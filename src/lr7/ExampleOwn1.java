package lr7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExampleOwn1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input folder:");
        String path = scanner.nextLine();

        System.out.println("Enter input file name:");
        String file_name = scanner.nextLine();
        File folder = new File(path);

        if (folder.exists()) {
            System.out.println("Folder is already exist: " + folder.getAbsolutePath());
        } else {
            if (folder.mkdir()) {
                System.out.println("Folder was created: " + folder.getAbsolutePath());
            } else {
                System.out.println("Folder creation failed:" +  folder.getAbsolutePath());
            }
        }
        File file = new File(folder.getAbsolutePath() + File.separator + file_name);
        try {
            if (file.createNewFile()) {
                System.out.println("File was created: " + file.getAbsolutePath());
            } else {
                System.out.println("File creation failed: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("File creation exeption:" + e.getMessage());
        }
        if (file.delete()) {
            System.out.println("File was deleted: " + file.getAbsolutePath());
        } else {
            System.out.println("File delete failed: " + file.getAbsolutePath());
        }

        if (folder.delete()) {
            System.out.println("Folder was deleted: " + folder.getAbsolutePath());
        } else {
            System.out.println("Folder delete failed: " + folder.getAbsolutePath());
        }
    }
}
