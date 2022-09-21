package com.epam.mjc.stage0;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String hasFur = this.hasFur?"a":"no",pawString = this.numberOfPaws>1?" paws":" paw";

        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws +pawString+" and "+hasFur+" fur.";
    }
}
