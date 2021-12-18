import java.util.Scanner;
public class BitPlusPlus {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        final int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            String op = scanner.next();
            Character firstCharacter = op.charAt(0);
            Character secondCharacter = op.charAt(1);
            if (firstCharacter.toString().equals("+") || secondCharacter.toString().equals("+")) {
                result += 1;
            } else {
                result -= 1;
            }
        }
        System.out.println(result);
    }
}
