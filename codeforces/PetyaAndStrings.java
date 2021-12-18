import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // reading 2 strings
        String firstString = scanner.next();
        String secondString = scanner.next();

        int stringsLength = firstString.length();

        for (int i = 0; i < stringsLength; i++) {
            int size1 = (int)firstString.toLowerCase().charAt(i);
            int size2 = (int)secondString.toLowerCase().charAt(i);

            if (size1 > size2) {
                System.out.println("1");
                return;
            } else if (size1 < size2) {
                System.out.println("-1");
                return;
            }
            if (i == stringsLength - 1) {
                System.out.println("0");
                return;
            }
        }
    }
}
