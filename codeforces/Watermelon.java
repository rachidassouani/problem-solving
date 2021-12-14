import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        int weight;
        Scanner scanner = new Scanner(System.in);
        weight = scanner.nextInt();
        if (weight > 2 && weight <= 100) {
            int result = weight % 2;
            System.out.print((result == 0) ? "YES" : "NO");
        } else {
            System.out.print("NO");
        }
    }
}
