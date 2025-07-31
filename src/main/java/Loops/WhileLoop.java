package Loops;

public class WhileLoop {
    public static void main(String[] args) {
    int i = 1;

    while(i <= 4){
        System.out.println("hi " +i);

        //Nested While Loop
        int j =1;
        while (j <= 3){
            System.out.println("hello " +j);
            j++;

        }
        i++;
    }
        System.out.println("bye "+i);
    }
}
