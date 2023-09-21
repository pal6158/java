import java.util.Scanner;

class Solution{
    static String oddEven(int N){
        if (N % 2 == 0) {
            
            return "even";
        
        }else{
            return "odd";
        }
        
        
        // code here
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.println( oddEven(p) ); 
        
    }
}