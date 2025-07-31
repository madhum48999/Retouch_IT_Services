package JavaBasicFundamentals;

public class LogicalOperators {
    public static void main(String[] args) {
        /* Logical Operators is the comparision of condition
        * Logical and &&
        * logical or ||
        * logical Not !=*/

            int x = 9;
            int y = 10;
            int a = 20;
            int b = 15;

            boolean result = x > y && a > b;
        System.out.println(result);

        boolean result1= x > y || a > b;
        System.out.println(result1);

        boolean result2 = x > y || a > b || a > b || y > b;
        System.out.println(result2);
        
        boolean result3 = x > y != a > b;
        System.out.println(result3);




    }
}
