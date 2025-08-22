package Phase3;

public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block started");

            try {
                // Inner try block 1
                int a = 10, b = 0;
                int result = a / b;  // ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught in Inner Try 1: " + e.getMessage());
            }

            try {
                // Inner try block 2
                String str = null;
                System.out.println("Length: " + str.length());  // NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Caught in Inner Try 2: " + e.getMessage());
            }

            System.out.println("Outer try block completed");
        } catch (Exception e) {
            System.out.println("Caught in Outer Try: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
