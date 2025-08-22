package Phase3;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;  // will throw ArithmeticException

            String str = null;
            System.out.println(str.length()); // would throw NullPointerException

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
