import java.util.Scanner;

public class CalculationsAndIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number (x): ");
        double x = scanner.nextDouble();

        System.out.print("Enter the second number (y): ");
        double y = scanner.nextDouble();

        
        double sum = x + y;
        double difference = x - y;
        double product = x * y;
        
        boolean validDivision = (y != 0);
        double quotient = validDivision ? (x / y) : 0;

        
        System.out.println("\n--- Results ---");
        System.out.println("Addition (x + y): " + sum);
        System.out.println("Subtraction (x - y): " + difference);
        System.out.println("Multiplication (x * y): " + product);
        
        if (validDivision) {
            System.out.println("Division (x / y): " + quotient);
        } else {
            System.out.println("Division (x / y): Cannot divide by zero.");
        }

        scanner.close();
    }
}

    
