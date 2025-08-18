package Assesment;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to test the classes
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.sound();
    }
}