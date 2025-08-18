package Oops;

public class Person {

    /* hiding data from the use , We will use private variables and getter and setter method

     */
    private String name;
    private int age;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}

