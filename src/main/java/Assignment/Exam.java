package Assignment;

class Parent{
    public void run(){
        System.out.println("I am Running");
    }
}
class Child extends Parent{
    public void run(int n){
        System.out.println("Number "+ n);
    }
}


public class Exam {
    public static void main(String[] args) {
Child c = new Child();
c.run();
    }
}
