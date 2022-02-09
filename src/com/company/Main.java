package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Chynara", "Java Developer", "Google");
        Dancer dancer = new Dancer("Aidana", "Pop Dancer", "Popdance");
        Singer singer = new Singer("Elvira", "Rock singer", "Rockband");
        System.out.println(programmer);
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();

        System.out.println("                                                         ");
        System.out.println(dancer);
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();

        System.out.println("                                                       ");
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();
        singer.playGuitar();


    }
}
