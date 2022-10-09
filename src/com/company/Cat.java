package com.company;

public class Cat implements AnimalIterface{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("miaw miaw");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
