package Assignment;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 9;
        double b = 4.0;

        //a. cast a to double and add to b
        double sum = a + b ;//implicit
        System.out.println("sum(a+b) : "+sum);

        //b. a/b
        double div = a/b;
        System.out.println("division(a/b) : "+div);

        //c.
        int c = (int)b;//expplicit
        boolean d = a > c;
        System.out.println("Is a > int(b) : "+d);

        //d. if a is divisible by 3 and b > 2.5

        boolean result = a%3 == 0 && b>2.5;
        System.out.println("If a is divisible by 3 and b > 2.5 : "+result);






    }
}
