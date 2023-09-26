import java.util.Scanner;

public class Question_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int  age = sc.nextInt();
        if (eligibleOrNotForVote(age)) {
            System.out.println("eli");
        } else {
            System.out.println("not eli");
        }
        sc.close();
    }

    int age = 21;
    public static boolean eligibleOrNotForVote(int age) {
        if (18<age) {
            return true;
        } else {
            return false;
                }
    }
    
}
