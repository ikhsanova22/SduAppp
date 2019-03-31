package com.example.sduapp;

public class Teacher {

    private String name = "";
    private String position = "";
    private int image = 0;

    public Teacher(String name, String position, int image) {
        this.name = name;
        this.position = position;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String phone) {
        this.position = position;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
