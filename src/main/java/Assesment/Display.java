package Assesment;

class StudentTest {
    public String name;
}
public class Display {
    public static void main(String[] args) {
        StudentTest student = new StudentTest();

        student.name = "Madhu";
        System.out.println("Student Name: " + student.name);
    }
}