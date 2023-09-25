package org.example;

public class Duck extends Animal implements Swimmable, Flyable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am a flying duck.");
    }

    @Override
    public void swim() {
        System.out.println("I am a swimming duck.");
    }
}
