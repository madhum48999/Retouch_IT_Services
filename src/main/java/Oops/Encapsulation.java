package Oops;

// Driver Class
public class Encapsulation {

    // main function
    public static void main(String[] args)
    {
        // person object created
        Person p = new Person();
        p.setName("Madhu");
        p.setAge(25);

        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
