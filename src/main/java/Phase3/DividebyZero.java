package Phase3;

import java.util.Scanner;
import java.io.*;


public class DividebyZero {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a ,b, divide;

        System.out.println("Enter Two number to divide");
        a = scanner.nextInt();
        b = scanner.nextInt();

        try{
            divide = a / b;
            System.out.println(divide);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
