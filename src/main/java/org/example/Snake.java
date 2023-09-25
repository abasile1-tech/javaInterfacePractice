package org.example;

public class Snake extends Animal implements Swimmable {

    public Snake(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("I am a swimming snake.");
    }
}
