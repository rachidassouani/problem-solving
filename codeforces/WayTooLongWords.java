import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            String input = scanner.nextLine();
            int length = input.length();
            if (length > 10) {
                char firstChart = input.charAt(0);
                char lastChart = input.charAt(length-1);
                String result = firstChart+""+(length-2)+""+lastChart;
                System.out.println(result);
            } else {
                System.out.println(input);
            }
        }
    }
}
