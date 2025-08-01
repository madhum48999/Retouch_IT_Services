package Assignment;

public class CharUnicode {
    public static void main(String[] args) {
        char letter = 'A';

        //cast char letter to int to get the unicode value of 'A'
        int unicode = (int)letter;

        //Add 1 to the char
        char nextletter = (char)(letter+1); // A+1 = B

        //print result
        System.out.println("Unicode of A: "+unicode);
        System.out.println("Next Letter: "+nextletter);
    }
}
