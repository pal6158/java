import java.util.*;

public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(oddNumbers(a, b));
        sc.close();
    }

    public static int oddNumbers(int a, int b) {
        if (a > b) {

            return a;
        } else {
            return b;
        }
    }
}