package lr7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class OwnTask6 {
    static class TestClass implements Serializable {
        private double testDouble;
        private int testInt;

        public TestClass(double testDouble, int testInt) {
            this.testDouble = testDouble;
            this.testInt = testInt;
        }

        public double getDouble() {
            return testDouble;
        }

        public int getInt() {
            return testInt;
        }
    }

    public static void main(String[] args) {
        TestClass test = new TestClass(3.14, 314);

        String file_output = "src/lr7/test_files/file_test.json";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file_output);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

            out.writeObject(test);
            out.close();
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(file_output);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);

            TestClass testIn = (TestClass) in.readObject();
            System.out.println("Class was read");
            System.out.println("testDouble: " + testIn.testDouble);
            System.out.println("testInt: " + testIn.testInt);

            System.out.println("Serializable data was saved: " + file_output);
        } catch (IOException e) {
            System.out.println("Data writing/serializable exception:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
