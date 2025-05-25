package lr7;

import lr7.test_files.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example7 {
    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 30);
        try {
            FileOutputStream fileOutput = new FileOutputStream("src/lr7/test_files/person.json");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(person);
            objectOutput.close();
            fileOutput.close();
            System.out.println("Объект Person успешно сериализован в файл person.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
