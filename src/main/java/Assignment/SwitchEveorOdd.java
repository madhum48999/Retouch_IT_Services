package Assignment;

public class SwitchEveorOdd {
    public static void main(String[] args) {
        int num=5;
        int res = num%2;
        switch (res){
            case 0:
                System.out.println("Even Number");
                break;
            default:
                System.out.println("Odd Number");
                break;

        }
    }
}
