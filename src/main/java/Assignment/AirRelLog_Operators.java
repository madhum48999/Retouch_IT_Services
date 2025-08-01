package Assignment;

public class AirRelLog_Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        //a. add,subtract, multiply and divide a and b
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        //b.1. if a is greater than b
        boolean isAgreB = a > b;
        //b.2. is a>b and b>0
        boolean and = a>b && b>0;

        //c. print all the results
        System.out.println("Addition : "+add);
        System.out.println("Subtraction : "+sub);
        System.out.println("Multiplication : "+mul);
        System.out.println("Division : "+div);
        System.out.println("Is a greater than b : "+isAgreB);
        System.out.println("Is a > b and b > 0 : "+and);
    }
}
