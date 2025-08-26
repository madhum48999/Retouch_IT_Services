package Miniproject;

public class StudentDetails implements DatabaseOperations {
    /*students variable, which is a reference to an array,
     cannot be re-assigned to point to a different array after initialization.
      While the reference is fixed*/
    private final Student[] students;
    private int count;

    public StudentDetails(int size) {
        students = new Student[size];
        count = 0;
    }

    public void add_Student(Student student) {
        if (count < students.length) {
            students[count++] = student;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Database is full! Cannot add more students.");
        }
    }

    public void view_Student() {
        if (count == 0) {
            System.out.println("No student records found.");
            return;
        }
        else {
            System.out.println("\n--- Student Records ---");
            for (int i = 0; i < count; i++) {
            System.out.println("ID: " + students[i].getId());
            System.out.println("Name: " + students[i].getName());
            System.out.println("Course: " + students[i].getCourse());
            System.out.println("Marks: " + students[i].getMarks());
            System.out.println("Result: " + (students[i].getMarks() >= 40 ? "Pass" : "Fail"));
            System.out.println("-----------------------");
        }
        }
    }

    public void update_Student(int id, String name, String course, double marks) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                students[i].setName(name);
                students[i].setCourse(course);
                students[i].setMarks(marks);
                System.out.println("Student updated successfully.");
                return;
            }
            else {
                System.out.println("student not found!!");
            }
        }
    }

    public void delete_student(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                // Shift remaining students left
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

//used to get the assigned teacher to student
    public Student findById(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return students[i];}
        }
            return null;
    }

}

