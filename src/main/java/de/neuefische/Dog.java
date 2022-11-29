package de.neuefische;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Dog implements Animal {

    private String name;
    private int age;


    @Override
    public String makeNoise() {
        return "wau";
    }

    @Override
    public String eat() {
        return "the dog eats his food";
    }

    @Override
    public String drink() {
        return "the dog drinks his water";
    }

    @Override
    public String sleep() {
        return "the dog sleeps in his bed";
    }
}
