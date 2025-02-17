import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String s = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String t = scanner.nextLine();
        scanner.close();

        if (isAnagram(s, t)) {
            System.out.println("Строки являются анаграммами.");
        } else {
            System.out.println("Строки НЕ являются анаграммами.");
        }
    }
}
