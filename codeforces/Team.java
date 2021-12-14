import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfProblems = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < numberOfProblems; i++) {
            int firstSolution  = scanner.nextInt();
            int secondSolution = scanner.nextInt();
            int thirdSolution  = scanner.nextInt();
            if (firstSolution + secondSolution + thirdSolution >= 2) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
