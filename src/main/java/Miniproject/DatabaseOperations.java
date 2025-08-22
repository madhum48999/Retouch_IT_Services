package Miniproject;

interface  DatabaseOperations {
    public void add_Student(Student student); /*Encapsulation → All details of a student (id, name, course, marks, assigned teacher, etc.) are stored inside the Student class.
    Instead of passing 4–5 separate parameters, you just pass one object.*/
    public void view_Student();
    public void update_Student(int id, String name, String course, double marks);
    public void delete_student(int id);


}
