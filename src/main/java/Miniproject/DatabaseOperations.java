package Miniproject;

interface  DatabaseOperations {
    public void add_Student(Student student);
    public void view_Student();
    public void update_Student(int id, String name, String course, double marks);
    public void delete_student(int[] id);


}
