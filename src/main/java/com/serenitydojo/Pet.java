package com.serenitydojo;

public abstract class Pet {

    private int age;
    private String name;

    public Pet(String name, int age) {

    }
    
    public String getName() {
        return name;
    }

    public abstract String play();

    public int getAge() {
        return age;
    }
}
