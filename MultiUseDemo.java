public class MultiUseDemo {

    
    public static void multiUse(int n) {
        System.out.println("--- 1 Parameter (Print 1 to " + n + ") ---");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    
    public static void multiUse(double a, double b) {
        System.out.println("--- 2 Parameters (Average of " + a + " and " + b + ") ---");
        double average = (a + b) / 2.0;
        System.out.println("Average: " + average);
    }

    
    public static void multiUse(int a, int b, int c) {
        System.out.println("--- 3 Parameters (Maximum of " + a + ", " + b + ", " + c + ") ---");
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum: " + max);
    }

    public static void main(String[] args) {
        // Testing the overloaded methods
        multiUse(5);                
        multiUse(10.5, 20.5);       
        multiUse(14, 42, 28);       
    }
}
