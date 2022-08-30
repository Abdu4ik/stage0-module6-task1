package com.epam.mjc.stage0;

public abstract class Animal {

    private String color;
    private int numberOfPaws;
    boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    String  getDescription (){
        String str = "This animal is mostly " +this.color+ ". It has " +((this.numberOfPaws>1)? " paws": " paw")+ " and "+((this.hasFur)?"a":"no")+" fur.";
        return str;
    }
}
