package org.example;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck("Donald");
        Eagle eagle1 = new Eagle("Sam");
        Snake snake1 = new Snake("Kaa");

//        duck1.fly();
//        eagle1.fly();
//        snake1.swim();
//        duck1.swim();

        Flyable[] flyingAnimals = new Flyable[2];
        flyingAnimals[0] = duck1;
        flyingAnimals[1] = eagle1;

        for (Flyable animal: flyingAnimals) {
            animal.fly();
        }
    }
}