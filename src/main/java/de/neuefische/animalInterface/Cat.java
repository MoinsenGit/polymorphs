package de.neuefische.animalInterface;

import de.neuefische.animalInterface.Animal;

public class Cat implements Animal {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String makeNoise() {
        return "meow";
    }

    public String eat(){
        return "the cat eats her food";
    }
    public String drink(){
        return "the cat drinks her water";
    }

    @Override
    public String sleep() {
        return "the cat sleeps in YOUR bed";
    }


}
