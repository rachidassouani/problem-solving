import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.next();
        String secondInput = scanner.next();

        final String reversedSecondInput = reverse(secondInput);

        if (firstInput.equals(reversedSecondInput))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    /*
        Method to reverse a given String
        EX: rachid
        return will be: dihcar
     */
    static String reverse(String input) {
        String result = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
            result += input.charAt(i);
        }
        return result;
    }
}
