package Assesment;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Cost of the pencil");
        float pencil = input.nextFloat();
        System.out.println("Enter Cost of the pen");
        float pen = input.nextFloat();
        System.out.println("Enter Cost of the eraser");
        float eraser = input.nextFloat();

        float totalcost = pencil+pen+eraser;

        float gst = totalcost*0.18f;

        float billaftergst = totalcost+gst;

        System.out.println("\n----- Bill -----");
        System.out.println("Cost of Pencil: Rs."+pencil);
        System.out.println("Cost of Pen: Rs."+pen);
        System.out.println("Cost of Eraser: Rs."+eraser);
        System.out.println("Total Cost (without GST): Rs."+totalcost);
        System.out.println("GST (18%): Rs."+gst);
        System.out.println("Final Bill (with GST): Rs."+billaftergst);
    }
}
