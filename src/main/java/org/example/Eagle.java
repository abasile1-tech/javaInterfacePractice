package org.example;

public class Eagle extends Animal implements Flyable{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am a flying Eagle.");
    }
}
