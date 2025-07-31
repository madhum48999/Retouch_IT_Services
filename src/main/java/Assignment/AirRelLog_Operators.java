package Assignment;

public class AirRelLog_Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        //a. add,subtract, multiply and divide a and b
        int add = a + b;
        System.out.println("Addition : "+add);

        int sub = a - b;
        System.out.println("Subtraction : "+sub);

        int mul = a * b;
        System.out.println("Multiplication : "+mul);

        int div = a / b;
        System.out.println("Division : "+div);

        //b. if a is greater than b
        boolean isAgreB = a > b;
        System.out.println("Is a greater than b : "+isAgreB);

        //c. is a>b and b>0
        boolean and = a>b && b>0;
        System.out.println("Is a > b and b > 0 : "+and);


    }
}
