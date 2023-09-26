import java.util.Scanner;

public class two_D_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int array[][] = new int[row][colm];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                array[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.print(+array[i][j] + " ");
            }
            System.out.println();
        }
        

    }
    
}
