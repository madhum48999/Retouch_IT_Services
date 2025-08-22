package Miniproject;
//
//public class StudentDetails implements DatabaseOperations {
//    /*students variable, which is a reference to an array,
//     cannot be re-assigned to point to a different array after initialization.
//      While the reference is fixed*/
//    private final Student[] students;
//    private int count;
//
//    public StudentDetails(int size) {
//        students = new Student[size];
//        count = 0;
//    }
//
//    public void add_Student(Student student) {
//        if (count < students.length) {
//            students[count++] = student;
//            System.out.println("Student added successfully.");
//        } else {
//            System.out.println("Database is full! Cannot add more students.");
//        }
//    }
//
//    public void view_Student() {
//        if (count == 0) {
//            System.out.println("No student records found.");
//            return;
//        }
//        else {
//            System.out.println("\n--- Student Records ---");
//            for (int i = 0; i < count; i++) {
//            System.out.println("ID: " + students[i].getId());
//            System.out.println("Name: " + students[i].getName());
//            System.out.println("Course: " + students[i].getCourse());
//            System.out.println("Marks: " + students[i].getMarks());
//            System.out.println("Result: " + (students[i].getMarks() >= 40 ? "Pass" : "Fail"));
//            System.out.println("-----------------------");
//        }
//        }
//    }
//
//    public void update_Student(int id, String name, String course, double marks) {
//        for (int i = 0; i < count; i++) {
//            if (students[i].getId() == id) {
//                students[i].setName(name);
//                students[i].setCourse(course);
//                students[i].setMarks(marks);
//                System.out.println("Student updated successfully.");
//                return;
//            }
//            else {
//                System.out.println("student not found!!");
//            }
//        }
//    }
//
//    public void delete_student(int id) {
//        for (int i = 0; i < count; i++) {
//            if (students[i].getId() == id) {
//                // Shift remaining students left
//                for (int j = i; j < count - 1; j++) {
//                    students[j] = students[j + 1];
//                }
//                students[count - 1] = null;
//                count--;
//                System.out.println("Student deleted successfully.");
//                return;
//            }
//        }
//        System.out.println("Student not found.");
//    }
//

import java.io.*;
import java.util.ArrayList;
import java.util.List;

////used to get the assigned teacher to student
//    public Student findById(int id) {
//        for (int i = 0; i < count; i++) {
//            if (students[i].getId() == id) {
//                return students[i];}
//        }
//            return null;
//    }
//
//}
class StudentDetails implements DatabaseOperations {
    private final String filename = "students.txt";

    // Add student (append to file)
    public void add_Student(Student s) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.write(s.toString() + "\n");
            System.out.println("Student added successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // View all students (read file)
    public void view_Student() {
        File file = new File(filename);
        if (!file.exists() || file.length() == 0) {
            System.out.println("No student records found.");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\n--- Student Records ---");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String course = data[2];
                int marks = Integer.parseInt(data[3]);

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Course: " + course);
                System.out.println("Marks: " + marks);
                System.out.println("Result: " + (marks >= 40 ? "Pass" : "Fail"));
                System.out.println("-----------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Update student
    public void update_Student(int id, String name, String course, double marks) {
        List<String> lines = new ArrayList<>();
        boolean updated = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int sid = Integer.parseInt(data[0]);
                if (sid == id) {
                    lines.add(id + "," + name + "," + course + "," + marks);
                    updated = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(filename)) {
            for (String l : lines) {
                fw.write(l + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (updated) System.out.println("Student updated successfully!");
        else System.out.println("Student not found.");
    }

    // Delete student
    public void delete_student(int id) {
        List<String> lines = new ArrayList<>();
        boolean deleted = false;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int sid = Integer.parseInt(data[0]);
                if (sid == id) {
                    deleted = true; // skip this line
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(filename)) {
            for (String l : lines) {
                fw.write(l + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (deleted) System.out.println("Student deleted successfully!");
        else System.out.println("Student not found.");
    }

    public Student findById(int id) {
        return null;
    }
}