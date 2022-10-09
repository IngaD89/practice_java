package com.company;

public class App {
    public static void main(String[] args) {
//        Animal animal = new Animal("Pepe");
        Dog dog = new Dog("Bruno", "bulldog");

       AnimalIterface cat = new Cat("kity");

        System.out.println(dog.getName() + " is a " + dog.getBreed());
        dog.makeSound();
        cat.makeSound();
    }
}
