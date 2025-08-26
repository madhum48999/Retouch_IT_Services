package Miniproject;

import java.util.Scanner;

public class DataMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDetails db = new StudentDetails(100);
        TeacherDetails teacherDB = new TeacherDetails(50);

        while (true) {
            System.out.println("\n=== Student Database Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Teacher");
            System.out.println("6. View Teachers");
            System.out.println("7. Update Teacher");
            System.out.println("8. Delete Teacher(s)");
            System.out.println("9. Exit");
            System.out.println("10. Assign Teacher to students");
            System.out.println("11. Check Assigned Teachers and Students");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            Student[] std;
            Teacher[] teach;

            switch (choice) {
                case 1:

                    System.out.println("Enter the number of students you wish to add: ");
                    int n = sc.nextInt();
                    std = new Student[n];
                    for (int i = 0; i < n; i++) {
                        int k = i + 1;
                        System.out.println("Enter Student " + k + " details: ");
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();
                        std[i] = new Student(id, name, course, marks);
                        db.add_Student(std[i]);
                    }
                    break;

                case 2:
                    db.view_Student();
                    break;

                case 3:
                    System.out.print("Enter ID of student to update: ");
                    int upId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();
                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();
                    db.update_Student(upId, newName, newCourse, newMarks);
                    break;

                case 4:
                    System.out.print("Enter ID of student to delete: ");
                    int delId = sc.nextInt();
                    db.delete_student(delId);
                    break;

                case 5:
                    System.out.println("Enter the number of Teacher you wish to add: ");
                    int m = sc.nextInt();
                    teach = new Teacher[m];
                    for (int i = 0; i < m; i++) {
                        int k = i + 1;
                        System.out.println("Enter Teacher " + k + " details: ");
                        System.out.print("Enter ID: ");
                        int tid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String tname = sc.nextLine();
                        System.out.print("Enter Subject: ");
                        String subject = sc.nextLine();
                        teach[i] = new Teacher(tid, tname, subject);
                        teacherDB.addTeacher(teach[i]);
                    }
                        break;

                    case 6:
                    teacherDB.viewTeachers();
                    break;

                case 7:
                            System.out.print("Enter Teacher ID to update: ");
                            int utid = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter New Name: ");
                            String tnewName = sc.nextLine();
                            System.out.print("Enter New Subject: ");
                            String tnewSubject = sc.nextLine();
                            teacherDB.updateTeacher(utid, tnewName, tnewSubject);
                            break;

                case 8:
                            System.out.print("Enter Teacher ID(s) to delete (space-separated): ");
                            String tids = sc.nextLine();
                            teacherDB.deleteTeacher(tids);
                            break;

                        case 9:
                            System.out.println("Exiting...");
                            sc.close();
                            return;

                case 10:
                    System.out.print("Enter Student ID to assign teacher: ");
                    int sidAssign = sc.nextInt(); sc.nextLine();

                    System.out.print("Enter Teacher ID: ");
                    int tidAssign = sc.nextInt(); sc.nextLine();

                    Student s = db.findById(sidAssign);
                    Teacher t = teacherDB.findById(tidAssign);

                    if (s == null) {
                        System.out.println("Student not found.");
                    } else if (t == null) {
                        System.out.println("Teacher not found.");
                    } else {
                        s.setTeacher(t);
                        System.out.println("Assigned Teacher " + t.getName() + " to Student " + s.getName());
                    }
                    break;

                case 11:
                    System.out.print("Enter Student ID to check teacher: ");
                    int sidCheck = sc.nextInt();

                    Student st = db.findById(sidCheck);
                    if (st == null) {
                        System.out.println("Student not found!");
                    } else if (st.getTeacher() == null) {
                        System.out.println("Teacher not assigned to " + st.getName());
                    } else {
                        Teacher o = st.getTeacher();
                        System.out.println("Teacher assigned: " + o.getName() + " (" + o.getSubject() + ")");
                    }
                    break;

                        default:
                            System.out.println("Invalid choice! Try again.");
                    }
            }
        }
    }

