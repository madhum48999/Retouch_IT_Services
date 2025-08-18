package Assignment;

import java.util.Scanner;

public class QizzProgram {
    public static void main(String[] args) {
        // Define questions, options, and correct answers
        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "What is 2 + 2?"
        };
        String[][] options = {
                {"A. Paris", "B. London", "C. Berlin", "D. Madrid"},
                {"A. Jupiter", "B. Mars", "C. Venus", "D. Mercury"},
                {"A. 3", "B. 4", "C. 5", "D. 6"}
        };
        char[] answers = {'A', 'B', 'B'};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Program!");
        System.out.println("Answer each question by selecting the correct option (A, B, C, or D).\n");

        // Iterate through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            // Display options
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Get user input
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer;
            try {
                userAnswer = scanner.next().toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Invalid input! Skipping this question.");
                continue;
            }

            // Validate and score the answer
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer was " + answers[i]);
            }
            System.out.println();
        }

        // Display final score
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.length);
        double percentage = (double) score / questions.length * 100;
        System.out.println("Percentage: " +percentage);

        scanner.close();
    }
}
