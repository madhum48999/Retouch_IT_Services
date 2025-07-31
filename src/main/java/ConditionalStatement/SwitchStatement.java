package ConditionalStatement;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //Switch statement is used when we have multiple cases or conditions and these are the keywords used
        //switch, case, break, default;

        //Let us print Days of Week Based on Below Condition;

        System.out.println("Enter a number between 1-7");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        //Let us check using ifelse statement

        if (n == 1) {

            System.out.println("Monday");
        }
        else if(n == 2){
            System.out.println("Tuesday");
        }
        else if(n == 3){
            System.out.println("Wednesday");
        }
        else if(n == 4){
            System.out.println("Thursday");
        }
        else if(n == 5){
            System.out.println("Friday");
        }
        else if(n == 6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Sunday");
        }

        //Using switch statement

        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input "+n);


        }
    }
}
