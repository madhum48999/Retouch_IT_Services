/*Encapsulation:
A principle of hiding a class's internal data (fields) by making them private and controlling access through public methods.
Ensures data integrity and restricts direct access to fields.

Getters/Setters:
Getters: Public methods that retrieve the value of a private field (e.g., getName()).
Setters: Public methods that modify the value of a private field, often with validation (e.g., setName(String name)).
Together, they provide controlled access to private fields.*/

package Oops;

public class EncapsuExam {
    private String name; // Private field
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        EncapsuExam encapsulation = new EncapsuExam();
        encapsulation.setName("Alice");
        encapsulation.setAge(25);
        System.out.println("Name: " + encapsulation.getName() + ", Age: " + encapsulation.getAge());
    }
}