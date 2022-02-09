package com.company;

public class Singer extends Person {
    String bandName;

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    void singing() {
        System.out.println("Singer is singing");
    }

    void playGuitar() {
        System.out.println(name + " is playing guitar");

    }
}
