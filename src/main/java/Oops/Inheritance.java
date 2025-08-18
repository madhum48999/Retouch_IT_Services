package Oops;
/*Inheritance is A mechanism in Java where a class (subclass/child)
inherits fields and methods from another class (superclass/parent)
using the extends keyword.

Super Keyword : Used in a subclass to refer to the superclass.*/
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Call superclass constructor
    }
    void bark() {
        System.out.println(name + " is barking");
    }
    void eat() { // Override superclass method
        super.eat(); // Call superclass method
        System.out.println(name + " loves treats");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat(); // Calls overridden method
        dog.bark();
    }
}