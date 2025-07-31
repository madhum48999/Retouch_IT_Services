package Assignment;

public class TypeAModOper
{
    public static void main(String[] args) {
        double x=22.7;
        int y = 4;

        //a.cast x to int and find (int)x%y
        int z = (int)x;
        int a = z%y;
        System.out.println("int(x%y) : "+a);

        //b. cast y to double and add to x
        double b = y;
        double c = b + x;
        System.out.println("x+double(y) : "+c);

        //c. check if (int)x equals y *5
        boolean d = z == y*5;
        System.out.println("Is (int)x equals y *5 : "+d);

        //d. check if x>20 and y < 10
        boolean e = x>20 && y<10;
        System.out.println(" Is x>20 and y < 10 : "+e);
    }
}
