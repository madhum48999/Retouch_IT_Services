package ConditionalStatement;

public class IfElse {

    public static void main(String[] args) {
        //Initiating a Variable

        int x = 18;

        //setting a condition

        if(x>20){
            System.out.println("Welcome to todays class");
        }
        else {
            System.out.println("Good Bye we are done today");
        }

        //b.
        int y = 12;

        if(y>10 && y<=20){
            System.out.println("GoodBye");
        }
        else {
            System.out.println("Welcome Home");
        }

        //c.  Check Greatest Number between X and Y

        if (x > y){
            System.out.println("The greatest number is : "+x);
        }
        else{
            System.out.println("The Greatest number is : "+y);
        }
    }
}
