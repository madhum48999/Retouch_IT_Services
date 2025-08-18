package Constructor;

public class Student {
    // Instance variables
    String name;
    int age;
    double grade;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = 0.0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("Parameterized constructor called");
    }

    // Constructor overloading (with only name and age)
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0; // Default grade
        System.out.println("Overloaded constructor (name, age) called");
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    // Main method to test constructors
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.display();

        // Using parameterized constructor
        Student s2 = new Student("Alice", 20, 85.5);
        s2.display();

        // Using overloaded constructor
        Student s3 = new Student("Bob", 18);
        s3.display();
    }
}
