package Assignment;

public class ForDoWhile {
    public static void main(String[] args) {

        //Using For Loop
        //print Format --> For Loop : 1 2 3 4 5
        System.out.print("For Loop : ");
        for(int i=1; i<=5; i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");

        //Using While Loop
        //print Format --> While Loop : 1 2 3 4 5
        int j=1;
        System.out.print("While Loop : ");
        while(j<=5){
            System.out.print(j+" ");
            j++;
        }
        System.out.println(" ");
        System.out.print("Do While Loop : ");

        //Using Do While Loop
        //print Format --> Do While Loop : 1 2 3 4 5
        int k=1;
        do{
            System.out.print(k+" ");
            k++;
        }
        while(k<=5);

    }
}
