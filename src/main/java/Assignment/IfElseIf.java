package Assignment;

public class IfElseIf {
    public static void main(String[] args) {
        int score = 40;
        if (score >= 90){
            char grade = 'A';
            System.out.println("Grade "+grade);
        }
        else if (75 <= score && score < 90){
            char grade = 'B';
            System.out.println("Grade "+grade);
        }
        else if (60 <= score && score < 75){
            char grade = 'C';
            System.out.println("Grade "+grade);
        }
        else{
                char grade = 'D';
                System.out.println("Grade "+grade);
            }
        }
    }

