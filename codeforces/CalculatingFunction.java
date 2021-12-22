import java.util.Scanner;
public class CalculatingFunction {
    public static void main(String[] args) {
        long result = 0;
        final long input =  new Scanner(System.in).nextLong();
        
        // my old solution
        /*
            for (int i = 1; i <= input; i++) {
                if (i % 2 == 0)
                    result += i;
                else
                    result -= i;
            }
            System.out.println(result);
         */

        // and since Math Already solved the problem, so I will take advantage of it
        if (input % 2 == 0)
            result = input / 2;
        else
            result = (-1) * (input / 2 + 1);
        System.out.println(result);
   }
}
