package Miniproject;

public class Teacher extends Person {

    private String subject;

    public Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void display(){
        super.display();
        System.out.println("Subject: "+subject);
    }
}
