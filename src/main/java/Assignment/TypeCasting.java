package Assignment;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 9;
        double b = 4.0;

        //a. cast a to double and add to b
        double sum = a + b ;//implicit

        //b. a/b
        double div = a/b;

        //c. cast b as int
        int c = (int)b;//explicit
        boolean d = a > c;

        //d. if a is divisible by 3 and b > 2.5
        boolean result = a%3 == 0 && b>2.5;

        //e. Print all the results
        System.out.println("sum(a+b) : "+sum);
        System.out.println("division(a/b) : "+div);
        System.out.println("Is a > int(b) : "+d);
        System.out.println("If a is divisible by 3 and b > 2.5 : "+result);
    }
}
