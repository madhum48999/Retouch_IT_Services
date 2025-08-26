package Miniproject;

public class Student extends Person  {
    private String course;
    private double marks;
    private Teacher teacher;

    public Student(int id, String name, String course, double marks) {
        super(id, name); // accessing super class members or invoking the superclass constructor - SUPER KEYWORD
        this.course = course; //this keyword used to  differentiate between local variable and instance variable
        this.marks = marks;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void display() {
      String  result = marks >= 40 ? "Pass" : "Fail";
        System.out.println("Course: " + course + ", Marks: " + marks +
                ", Result: " +result );

        if (teacher != null) {
            System.out.println("Assigned Teacher: "
                    + teacher.getName() + " (" + teacher.getSubject() + ")");
        } else {
            System.out.println("Assigned Teacher: None");
        }
    }
}
