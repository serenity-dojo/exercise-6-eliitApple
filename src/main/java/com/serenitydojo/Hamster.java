package com.serenitydojo;

public  class Hamster extends Pet {
    private String wheel;

    public Hamster(String hazel, int i, String wheel) {
        super(hazel, i);
        this.wheel = wheel;
    }

    @Override
    public String play() {
        return "runs with wheels";
    }
}
