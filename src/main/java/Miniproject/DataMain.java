package Miniproject;

import java.util.Scanner;

public class DataMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StudentDetails db = new StudentDetails(1000);

            while (true) {
                System.out.println("\n=== Student Database Management System ===");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the number of students you wish to add: ");
                        int n = sc.nextInt();
                        Student[] student = new Student[n];
                        for(int i=0; i<n; i++) {
                            int k=i+1;
                            System.out.println("Enter Student "+ k +" details: ");
                            System.out.print("Enter ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter Course: ");
                            String course = sc.nextLine();
                            System.out.print("Enter Marks: ");
                            double marks = sc.nextDouble();
                            db.add_Student(student[i]);
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
                        System.out.print("How many students do you want to delete? ");

                        int m = sc.nextInt();
                        int[] ids = new int[m];
                        for (int i = 0; i < m; i++) {
                            System.out.print("Enter ID " + (i + 1) + ": ");
                            ids[i] = sc.nextInt();
                        }
                        db.delete_student(ids);
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }
        }
    }

