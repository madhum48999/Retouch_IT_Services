package Oops;

// Class definition A blueprint or template for creating objects.
public class Student {
    // Fields (properties)
    String name;
    int id;
    double grade;

    // Constructor (default) :
    /* Constructor: A special method in a class with the same name as the class,
    used to initialize objects. It has no return type and is called with the new keyword.
     */
    Student() {
        /*this Keyword: Refers to the current object in a constructor or method,
        used to distinguish instance variables from parameters
        or to call another constructor in the same class.*/
        this.name = "Unknown";
        this.id = 0;
        this.grade = 0.0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Student(String name, int id, double grade) {
        this.name = name; // 'this' distinguishes instance variable from parameter
        this.id = id;
        this.grade = grade;
        System.out.println("Parameterized constructor called for " + name);
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }

    // Method to determine grade status
    String getGradeStatus() {
        if (grade >= 90) {
            return "Excellent";
        } else if (grade >= 75) {
            return "Good";
        } else if (grade >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating objects : Defination : An instance of a class, created using the new keyword.
        Student student1 = new Student(); // Using default constructor
        Student student2 = new Student("Alice", 101, 85.5); // Using parameterized constructor
        Student student3 = new Student("Bob", 102, 92.0);

        // Calling methods on objects
        System.out.println("\nStudent Details:");
        student1.displayDetails();
        System.out.println("Grade Status: " + student1.getGradeStatus());

        student2.displayDetails();
        System.out.println("Grade Status: " + student2.getGradeStatus());

        student3.displayDetails();
        System.out.println("Grade Status: " + student3.getGradeStatus());

        // Modifying an object's field
        student1.name = "Charlie";
        student1.id = 103;
        student1.grade = 65.0;
        System.out.println("\nAfter modification:");
        student1.displayDetails();
        System.out.println("Grade Status: " + student1.getGradeStatus());
    }
}