public class circumference {
    public static double calculateCircumference(double radius) {
        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return -1; // You can choose to return an error code or handle the error differently.
        }
        
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        double circumference = calculateCircumference(radius);
        
        if (circumference != -1) {
            System.out.println("The circumference of a circle with radius " + radius + " is " + circumference);
        }
        
    }
}
