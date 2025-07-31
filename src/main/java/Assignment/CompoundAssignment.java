package Assignment;

public class CompoundAssignment {
    public static void main(String[] args) {
        int x= 17;
        int y = 2;

        //add y to x
        x+=y;
        System.out.println("After addition : "+x);

        // mult x by 2
        x*=2;
        System.out.println("After Multiplication : "+x);

        // % remainder
        int remainder = x%y;
        System.out.println("Remainder : "+remainder);
    }
}
