package Loops;

public class ForLoop {

    public static void main(String[] args) {
        /* we have finite and infinite loop
           Finite Loop : When we know the starting and Ending Point Both
           Infinite Loop : When we know the starting point not the ending point
         */

    int i = 1;

    //using while loop
        while (i <= 4){
            System.out.println("hi "+i);

            //increment
            i++;
        }

        //using for loop ( Increment )
        for(int j = 1; j <= 4; j++){
            System.out.println("You are highly to the for Loop "+j);
        }

        //using for loop (decrement)
        for(int k = 10; k >=0 ; k--){
            System.out.println("bye "+k);
        }
    }
}
