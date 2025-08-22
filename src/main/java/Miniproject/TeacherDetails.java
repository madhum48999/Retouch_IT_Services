package Miniproject;

public class TeacherDetails {
    private final Teacher[] teachers;
    private int count;

    public TeacherDetails(int size) {
    teachers = new Teacher[size];
    count =0;
    }

    public void addTeacher(Teacher t) {
        if (count < teachers.length) {
            teachers[count++] = t;
            System.out.println("Teacher added.");
        } else {
            System.out.println("Teacher DB is full!");
        }
    }

    public void viewTeachers() {
        if (count == 0) {
            System.out.println("No teacher records.");
            return;
        }
        for (int i = 0; i < count; i++) {
            teachers[i].display();
            System.out.println("-----------------");
        }
    }

    public void updateTeacher(int id, String name, String subject) {
        for (int i = 0; i < count; i++) {
            if (teachers[i].getId() == id) {
                teachers[i].setName(name);
                teachers[i].setSubject(subject);
                System.out.println("Teacher updated.");
                return;
            }
        }
        System.out.println("Teacher not found.");
    }

    public void deleteTeacher(String idsInput) {
        String[] parts = idsInput.split(" ");
        for (String part : parts) {
            int id = Integer.parseInt(part.trim());
            boolean deleted = false;
            for (int i = 0; i < count; i++) {
                if (teachers[i].getId() == id) {
                    for (int j = i; j < count - 1; j++) {
                        teachers[j] = teachers[j + 1];
                    }
                    teachers[count - 1] = null;
                    count--;
                    deleted = true;
                    System.out.println("Deleted teacher with ID: " + id);
                    break;
                } else {
                    System.out.println("Teacher with ID " + id + " not found.");
                }
            }
        }
    }
    public int getCount() {
        return count;
    }

    //Find Teachers by id
    public Teacher findById(int id) {
        for (int i = 0; i < count; i++) {
            if (teachers[i].getId() == id) return teachers[i];
        }
        return null;
    }
}
