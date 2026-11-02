import java.util.Scanner;

public class MenuLoopProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int x = 0;
        int y = 0;
        boolean numbersEntered = false;

        do {
            // Print the menu
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Enter two (2) numbers (x and y).");
            System.out.println("2 - Print all numbers between x and y.");
            System.out.println("3 - Find the average of all numbers between x and y.");
            System.out.println("4 - Find all prime numbers between x and y.");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice (1-5): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.next(); 
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter value for x: ");
                    x = scanner.nextInt();
                    System.out.print("Enter value for y: ");
                    y = scanner.nextInt();
                    numbersEntered = true;
                    System.out.println("Numbers set successfully: x = " + x + ", y = " + y);
                    break;

                case 2:
                    if (!numbersEntered) {
                        System.out.println("Please enter numbers x and y first (Option 1).");
                        break;
                    }
                    printNumbers(x, y);
                    break;

                case 3:
                    if (!numbersEntered) {
                        System.out.println("Please enter numbers x and y first (Option 1).");
                        break;
                    }
                    calculateAverage(x, y);
                    break;

                case 4:
                    if (!numbersEntered) {
                        System.out.println("Please enter numbers x and y first (Option 1).");
                        break;
                    }
                    findPrimes(x, y);
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    
    public static void printNumbers(int x, int y) {
        int start = Math.min(x, y);
        int end = Math.max(x, y);
        System.out.print("Numbers between " + x + " and " + y + ": ");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    
    public static void calculateAverage(int x, int y) {
        int start = Math.min(x, y);
        int end = Math.max(x, y);
        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("The average of numbers between " + x + " and " + y + " is: " + average);
    }

    
    public static void findPrimes(int x, int y) {
        int start = Math.min(x, y);
        int end = Math.max(x, y);
        System.out.print("Prime numbers between " + x + " and " + y + ": ");
        boolean foundPrime = false;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                foundPrime = true;
            }
        }
        if (!foundPrime) {
            System.out.print("None");
        }
        System.out.println();
    }

    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}