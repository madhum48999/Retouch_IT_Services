package ConditionalStatement;

public class IfElseIf {
    public static void main(String[] args) {
        //Initiating variable declaration
        int x = 8;
        int y = 25;
        int z = 20;

        //checking the greatest value between three variables x, y, & z

        //Setting our conditions
        if(x > y && x > z){
            System.out.println("X is the greatest number : "+x);
        }
        else if(y>x && y>z){
            System.out.println("Y is the greatest number : "+y);
        }
        else{
            System.out.println("Z is the greatest number : "+z);
        }
    }
}
