import java.util.Scanner;

public class arrayFirst {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String a[] = new String[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.next();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }
}