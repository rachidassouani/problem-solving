import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int capitalCount = 0;
        char character;
        for (int i = 0; i < word.length(); i++) {
            character = word.charAt(i);
            if (Character.isUpperCase(character)) {
                capitalCount += 1;
            }
        }
        if ((word.length()-capitalCount) >= capitalCount) {
            System.out.println(word.toLowerCase());
        } else  {
            System.out.println(word.toUpperCase());
        }
    }
}
