import java.util.Scanner;

public class PowerCalculation {
    public static double calculatePower(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base (x): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int exponent = scanner.nextInt();

        double result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);

        scanner.close();
    }
}
