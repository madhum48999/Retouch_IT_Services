package Assignment;

public class IfElseIf {
    public static void main(String[] args) {
        int score = 120;
        char grade;
        if (score >= 90){
             grade = 'A';
        }
        else if (75 <= score && score < 90){
             grade = 'B';

        }
        else if (60 <= score && score < 75){
             grade = 'C';
        }
        else{
                 grade = 'D';
            }
        System.out.println("Grade "+grade);
    }

    }

