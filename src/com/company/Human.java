package com.company;

public class Human {
    private int age;
    private String name;
    private int size;
    private String hairColor;
    private String eyeColor;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Human(int age, String name, int size, String hairColor, String eyeColor) {
        this.age = age;
        this.name = name;
        this.size = size;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public Human() {
    }

}
