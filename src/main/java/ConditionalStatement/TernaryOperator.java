package ConditionalStatement;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary Operator : Simply operated using "?" and ":"
    Scanner obj = new Scanner(System.in);
        //check if number is even
        System.out.println("Enter a Number to check Even or Odd");
        int n = obj.nextInt();
        int result = 0;

        //a. Using If else statement
        if(n % 2 == result){
            System.out.println("the number is Even");
        }
        else{
            System.out.println("the number is Odd");
        }
        String res=(n % 2  == 0)? "Number is Even" : "Number is Odd";
        System.out.println(res);
    }
}
