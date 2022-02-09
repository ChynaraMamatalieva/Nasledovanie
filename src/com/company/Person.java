package com.company;

public class Person {
    String name;
    String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    void learn() {
        System.out.println(name + " is learning");
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");

    }
}
