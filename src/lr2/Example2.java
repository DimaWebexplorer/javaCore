package lr2;

public class Example2 {
    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayLong = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayLong[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayLong[i];
        }

        encryptString = new String(arrayCharNew);

        return encryptString;
    }
}
