package Assesment;

class StudentTest {
    public String name;
}
public class Display {
    public static void main(String[] args) {
        StudentTest student = new StudentTest();

        // Assign a value to the public name variable
        student.name = "Madhu";

        // Print the name
        System.out.println("Student Name: " + student.name);
    }
}