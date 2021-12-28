import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println((input.charAt(0)+"").toUpperCase()+input.substring(1));

    }
}
