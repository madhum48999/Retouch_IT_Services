package Phase3;

public class FinallyDemo {
    public static void main(String[] args) {

        // Case 1: No Exception
        try {
            System.out.println("Try Block");
            int a = 10, b = 2;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed (Case 1)\n");
        }
    }
}

